package medcenter.view;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import medcenter.presenter.Presenter;
import medcenter.presenter.TestPresenter;

@SpringView(name = "") // Root view
public class UserView extends VerticalLayout implements View {

	@Autowired
	private TestPresenter service;

	@Autowired
	Presenter presenter;

	@PostConstruct
	void init() {
		setMargin(true);
		// String s = this.service.toString();
		Label label = new Label(this.presenter.sovai());
		label.setValue(this.presenter.sovai());
		label.addStyleName("red");
		addComponent(label);
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		// NOP
	}
}
