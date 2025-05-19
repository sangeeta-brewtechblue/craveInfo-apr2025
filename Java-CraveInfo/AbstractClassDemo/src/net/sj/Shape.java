package net.sj;

public abstract class Shape {
	private String colour;
	
	public abstract void calculateArea() ;
		
	
	public void showColour() {
		System.out.println("Colour of this shape is:"+colour);
	}
	
	

	public Shape(String colour) {
		super();
		this.colour = colour;
	}

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public static boolean isShape() {
		return true;
	}
	
	
	

}
