package com.medcenter.medcenter;

import org.springframework.stereotype.Component;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@Component // No SpringView annotation because this view can not be navigated to
@UIScope
public class ErrorView extends VerticalLayout implements View {

	private Label errorLabel;

	public ErrorView() {
		setMargin(true);
		this.errorLabel = new Label();
		this.errorLabel.addStyleName(ValoTheme.LABEL_FAILURE);
		this.errorLabel.setSizeUndefined();
		addComponent(this.errorLabel);
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		this.errorLabel.setValue(String.format("No such view: %s", event.getViewName()));
	}
}
