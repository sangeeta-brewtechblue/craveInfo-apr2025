package net.sj;

public class Circle extends Shape {
     private int r;
	//@Override
	public void calculateArea() {
		// TODO Auto-generated method stub

	   System.out.println("Area of circle is:"+(3.14*r*r));
	
	
	}
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String colour, int r) {
		super(colour);
		this.r = r;
	}

	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	

}
