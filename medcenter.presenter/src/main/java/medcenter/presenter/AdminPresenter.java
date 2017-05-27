package medcenter.presenter;

import org.springframework.context.annotation.Scope;

import com.vaadin.spring.annotation.SpringComponent;

import medcenter.presenter.base.AbstractPresenter;

@SpringComponent
@Scope(value = "prototype")
public class AdminPresenter extends AbstractPresenter<AdminViewInfo> {

	@Override
	public AdminViewInfo getNeededInfo() {
		return new AdminViewInfo();
	}

}
