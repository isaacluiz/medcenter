package com.medcenter.medcenter.app;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.util.CurrentInstance;

import medcenter.view.TestView;

@SpringUI
public class MedCenterUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		CurrentInstance.set(MedCenterUI.class, this);
		CurrentInstance.setCurrent(this);
		setContent(new TestView());
	}

}
