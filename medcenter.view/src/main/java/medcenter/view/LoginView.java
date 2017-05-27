package medcenter.view;

import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.Page;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class LoginView extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	private VerticalLayout layout;

	public LoginView(LoginCallback callback) {
		this.layout = new VerticalLayout();
		this.layout.setMargin(true);
		this.layout.setSpacing(true);
		this.layout.setSizeUndefined();

		setSizeFull();
		setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

		HorizontalLayout fields = new HorizontalLayout();
		fields.setDefaultComponentAlignment(Alignment.BOTTOM_LEFT);

		TextField username = new TextField("Username");
		username.setPlaceholder("username");
		username.setIcon(VaadinIcons.USER);
		username.addStyleName(ValoTheme.TEXTFIELD_INLINE_ICON);

		PasswordField password = new PasswordField("Password");
		password.setPlaceholder("password");
		password.setIcon(VaadinIcons.LOCK);
		password.addStyleName(ValoTheme.TEXTFIELD_INLINE_ICON);

		Button signin = new Button("Entrar", e -> {
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
		signin.addStyleName(ValoTheme.BUTTON_PRIMARY);
		signin.setClickShortcut(KeyCode.ENTER);
		signin.focus();

		fields.addComponents(username, password, signin);

		this.layout.addComponent(fields);

		addComponent(this.layout);
	}

	@FunctionalInterface
	public interface LoginCallback {

		boolean login(String username, String password);
	}
}
