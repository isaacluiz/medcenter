package com.medcenter.medcenter.app;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewDisplay;

public class MedCenterNavigator extends Navigator {

	public MedCenterNavigator(MyUI myUI, ViewDisplay springViewDisplay) {
		super(myUI, springViewDisplay);
	}

	@Override
	public void navigateTo(String navigationState) {
		try {
			super.navigateTo(navigationState);
		} catch (IllegalArgumentException e) {

		}
	}

}
