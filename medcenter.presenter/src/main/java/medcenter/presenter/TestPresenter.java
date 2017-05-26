package medcenter.presenter;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

import medcenter.backend.TestService;

@SpringComponent
@ViewScope
public class TestPresenter {

	@Autowired
	private TestService service;

	public String hello() {
		return this.service.hello();
	}

}
