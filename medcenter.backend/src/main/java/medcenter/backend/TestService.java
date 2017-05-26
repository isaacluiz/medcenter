package medcenter.backend;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class TestService {

	public String hello() {
		return "teste service";
	}
}
