package medcenter.presenter.presenter;

import com.vaadin.ui.Component;

import medcenter.view.TestView;

public class TestPresenter extends Presenter<TestView> {

	@Override
	public Component renderView() {
		return this.view.render();
	}

}
