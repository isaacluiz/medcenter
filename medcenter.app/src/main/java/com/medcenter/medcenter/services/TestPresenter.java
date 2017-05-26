package com.medcenter.medcenter.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class TestPresenter {

	@Autowired
	private TestService service;

	public String hello() {
		return this.service.hello();
	}

}
