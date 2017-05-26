package com.medcenter.medcenter.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.medcenter.medcenter.services.TestPresenter;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = "") // Root view
public class UserView extends VerticalLayout implements View {

	@Autowired
	private TestPresenter service;

	@PostConstruct
	void init() {
		setMargin(true);
		// String s = this.service.toString();
		addComponent(new Label(this.service.hello()));
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		// NOP
	}
}
