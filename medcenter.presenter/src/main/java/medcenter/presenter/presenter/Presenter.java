package medcenter.presenter.presenter;

import org.springframework.beans.factory.annotation.Autowired;

import medcenter.view.view.IView;

public abstract class Presenter<VIEW extends IView> implements IPresenter {

	@Autowired
	VIEW view;

}
