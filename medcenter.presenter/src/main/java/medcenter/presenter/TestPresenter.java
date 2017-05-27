package medcenter.presenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.vaadin.spring.annotation.SpringComponent;

import medcenter.backend.TestService;
import medcenter.presenter.base.AbstractPresenter;

@SpringComponent
@Scope(value = "prototype")
public class TestPresenter extends AbstractPresenter<TestViewInfo> {

	@Autowired
	private TestService service;

	public String hello() {
		return this.service.hello();
	}

	@Override
	public TestViewInfo getNeededInfo() {
		TestViewInfo testViewInfo = new TestViewInfo();
		testViewInfo.setTest(this.service.hello());
		return testViewInfo;
	}

}
