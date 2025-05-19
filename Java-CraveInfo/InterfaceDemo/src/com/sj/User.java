package com.sj;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Account a1 = new Account(1,"act1",50000);
		 Account a2 = new Account(2,"act2",60000);
		 a1=a2;
		 System.out.println(a1);
		 System.out.println(a2);
		 Employee e= new Employee(1,"emp1",50000);
		 System.out.println(e);
		 
		
		/*
		 * Printable[]p = new Printable[4]; p[0]= new Employee(1,"emp1",50000); p[1]=
		 * new Account(1,"actHolder1",40000); p[2]= new Employee(2,"emp2",60000); p[3]=
		 * new Account(2,"actHolder2",45000);
		 * 
		 * Utility.printAll(p);
		 */
			
			
			
	}

}
