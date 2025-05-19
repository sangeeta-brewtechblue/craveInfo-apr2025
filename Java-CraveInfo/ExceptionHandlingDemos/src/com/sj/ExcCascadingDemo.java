package com.sj;

public class ExcCascadingDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Exce e1 = new Exce();
        e1.m1();
		/*
		 * try { e1.m1();
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * System.out.println("Exception getting thrown in M3 and handled in main");
		 * //.printStackTrace(); }
		 */
	
	}

}

class Exce{
	
	public void m1() throws Exception {
		System.out.println("in m1");
		m2();
	}
    public void m2() throws Exception {
    	System.out.println("in m2");
    	m3();
	}
    public void m3() throws Exception {
    	System.out.println("in m3");
    	
    	  throw new Exception();
    	
    }
	
}
