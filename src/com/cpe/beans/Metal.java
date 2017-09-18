package com.cpe.beans;

public class Metal {
	private String metalName;
	private Dimensions dimension;

	public void setMetalName(String metalName) {
		this.metalName = metalName;
	}

	public void setDimension(Dimensions dimension) {
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "Metal [metalName=" + metalName + ", dimension=" + dimension
				+ "]";
	}

	
}
