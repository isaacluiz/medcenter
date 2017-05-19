package medcenter.view;

import com.vaadin.ui.Component;
import com.vaadin.ui.Label;

import medcenter.view.view.View;

public class TestView extends View {

	private static final long serialVersionUID = 1L;

	public TestView() {

	}

	@Override
	public Component render() {
		addComponent(new Label("TESTE VIEW"));
		return this;
	}
}
