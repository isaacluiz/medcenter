package medcenter.view;

import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;

import medcenter.presenter.TestPresenter;
import medcenter.presenter.TestViewInfo;
import medcenter.view.base.AbstractView;

@SpringView(name = "test")
public class TestView extends AbstractView<TestPresenter, TestViewInfo> {

	private static final long serialVersionUID = 1L;

	@Override
	protected void render(TestViewInfo info) {
		addComponent(new Label(info.getTest()));
	}

}
