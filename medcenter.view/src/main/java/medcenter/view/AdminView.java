package medcenter.view;

import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;

import medcenter.presenter.AdminPresenter;
import medcenter.presenter.AdminViewInfo;
import medcenter.view.base.AbstractView;

@SpringView
public class AdminView extends AbstractView<AdminPresenter, AdminViewInfo> {

	private static final long serialVersionUID = 1L;

	@Override
	protected void render(AdminViewInfo info) {
		super.render(info);
		addComponent(new Label(info.getTest()));

	}
}
