package com.medcenter.medcenter.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@Theme("valo")
@SpringUI
public class MedCenterUI extends UI {

	private static final long serialVersionUID = 1L;

	@Autowired
	private AutowireCapableBeanFactory springBeanFactory;

	@Override
	protected void init(VaadinRequest request) {
		Teste t = this.springBeanFactory.getBean(Teste.class);
		setContent(new Label(t.sayHello()));
	}
}
