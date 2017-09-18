package com.cpe.editors;



import java.beans.PropertyEditorSupport;

import com.cpe.beans.Dimensions;

public class DimensionPropertyEditors extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Dimensions dimensions = null;
		String[] token = null;
		token = text.split(",");
		if(token.length != 3) {
			throw new IllegalArgumentException("Invalid dimensions input");
		}
		dimensions = new Dimensions();
		dimensions.setLength(Integer.parseInt(token[0]));
		dimensions.setWidth(Integer.parseInt(token[1]));
		dimensions.setThickness(Integer.parseInt(token[2]));
		setValue(dimensions);
	}

	
	
}
