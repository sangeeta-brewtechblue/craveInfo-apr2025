package net.sj;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] animals = new Animal[3];
		animals[0]= new Cat();
		animals[1]= new Dog();
		animals[2]= new Lion();
		
		
		for(Animal a :animals) {
			a.talk();
		}
		Animal.respirate();
		
		
		
		
		
		
		
	    Shape[]shapes = new Shape[4];
	    shapes[0]= new Rectangle("blue",5,4);
	    shapes[1]= new Circle("White",7);
	    shapes[2]= new Rectangle("red",15,4);
	    shapes[3]= new Circle("Magenta",13);
	    
	    for(Shape s:shapes) {
	    	s.calculateArea();
	    	s.showColour();
	    }
	    
	    
	
	}

}
