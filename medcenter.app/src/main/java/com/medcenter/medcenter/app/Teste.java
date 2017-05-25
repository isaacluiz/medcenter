package com.medcenter.medcenter.app;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class Teste {

	public String sayHello() {
		return "test";
	}
}
