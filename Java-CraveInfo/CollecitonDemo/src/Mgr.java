

public class Mgr extends Employee{
	private double someAllow;

	public Mgr() {
		
	//	super(1,"www",56000);
		// TODO Auto-generated constructor stub
	}

	public Mgr(int empId, String empName, double basicSalary,double someAllow) {
		super(empId, empName, basicSalary);
		this.someAllow=someAllow;
		
		// TODO Auto-generated constructor stub
	}
	
	public void calculateSalary() {
		super.calculateSalary();
		System.out.println("Total salary of a Mgr:"+(this.getBasicSalary()+someAllow));
	}
	
	public void showAllow() {
		System.out.println("mgr allowance:"+someAllow);
	}
	
	

}
