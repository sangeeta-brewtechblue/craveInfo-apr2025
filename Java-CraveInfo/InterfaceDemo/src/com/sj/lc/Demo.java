package com.sj.lc;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Calculator calc=null;
		if (args[0].equals("A"))
			calc = new CalculatorA();
		else
			calc = new CalculatorB();

        User user = new User();
        user.setCalc(calc);
	    user.invokeFindSqrrt(5);
	
	
	}

}
