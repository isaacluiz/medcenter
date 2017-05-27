package medcenter.view.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

import medcenter.presenter.base.AbstractPresenter;

public abstract class AbstractView<PRESENTER extends AbstractPresenter<INFO>, INFO> extends VerticalLayout
		implements View {

	private static final long serialVersionUID = -4892380645257614886L;

	@Autowired
	PRESENTER presenter;

	@Override
	public void enter(ViewChangeEvent event) {
		render(this.presenter.getNeededInfo());
	}

	protected abstract void render(INFO info);

}
