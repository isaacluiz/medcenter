package com.medcenter.medcenter.app.navigator;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.Page.PopStateEvent;
import com.vaadin.server.Page.PopStateListener;
import com.vaadin.ui.Component;

import medcenter.presenter.node.INode;

public class Navigator implements ViewDisplay, PopStateListener {

	private static final long serialVersionUID = 1L;

	public Component navigateTo(INode node) {
		return node.attach();
	}

	@Override
	public void uriChanged(PopStateEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showView(View view) {
		// TODO Auto-generated method stub

	}

}
