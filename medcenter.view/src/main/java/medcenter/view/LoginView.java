package medcenter.view;

import com.vaadin.event.ShortcutAction;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class LoginView extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public LoginView(LoginCallback callback) {
		setMargin(true);
		setSpacing(true);

		TextField username = new TextField("Username");
		addComponent(username);

		PasswordField password = new PasswordField("Password");
		addComponent(password);

		Button login = new Button("Login", evt -> {
			String pword = password.getValue();
			password.setValue("");
			if (!callback.login(username.getValue(), pword)) {
				Notification n = new Notification("Login failed", Type.ERROR_MESSAGE);
				n.setDelayMsec(5000);
				n.show(Page.getCurrent());
				// Notification.show("Login failed");
				username.focus();
			}
		});
		login.setClickShortcut(ShortcutAction.KeyCode.ENTER);
		addComponent(login);
	}

	@FunctionalInterface
	public interface LoginCallback {

		boolean login(String username, String password);
	}
}
