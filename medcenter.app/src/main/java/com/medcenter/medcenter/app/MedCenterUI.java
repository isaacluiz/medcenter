package com.medcenter.medcenter.app;

import com.medcenter.medcenter.app.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.util.CurrentInstance;

import medcenter.presenter.node.TestNode;

@SpringUI
public class MedCenterUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		CurrentInstance.set(MedCenterUI.class, this);
		CurrentInstance.setCurrent(this);
		Navigator n = new Navigator();
		n.navigateTo(new TestNode());
	}

}
