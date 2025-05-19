package com.sj;

public class Employee {
	private int empId;
	private String empName;
	private double basicSalary;	
	private static int ctr=0;
	
	
	  public Employee() {
		  	  
		  super();
		  ctr++;
	  
	  }// TODO Auto-generated constructor stub }
	 
	
	public Employee(int empId, String empName, double basicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		ctr++;
	}

	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void calculateSalary() {
		System.out.println("Total salary of an emp:"+basicSalary);
	}
	
	public void showIdName() {
		System.out.println("Name:"+empName+"id:"+empId);
	}
	
	public static void showCtr() {
		System.out.println("no of employees:"+ctr);
	}
	
	
	

}
