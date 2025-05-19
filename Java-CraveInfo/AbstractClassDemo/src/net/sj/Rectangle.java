package net.sj;

public class Rectangle extends Shape {
     int length;
     int width;
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of the rectangle is:"+(length*width));
	}
		
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}



	

	public Rectangle(String colour, int length, int width) {
		super(colour);
		this.length = length;
		this.width = width;
	}



	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
    
	

}
