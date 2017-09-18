package com.cpe.util;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import com.cpe.beans.Dimensions;
import com.cpe.editors.DimensionPropertyEditors;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Dimensions.class, new DimensionPropertyEditors());
	} 
	
}
