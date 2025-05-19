package com.sj;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee []e =new Employee[5];
		 e[0]=  new Employee(2,"xyz",50000);
		 e[1]=  new Mgr(1,"mgr2",60000,10000);
		 e[2]=  new Employee(5,"abc",50000);
		 e[3]=  new Mgr(23,"mgr3",65000,15000);
		 e[4]=  new Mgr(3,"mgr4",75000,25000);
	      
	      for(Employee e1:e) {
	    	  e1.calculateSalary();
	    	  
	      }
	      
	       Employee.showCtr();
	      
	      
	}

}
