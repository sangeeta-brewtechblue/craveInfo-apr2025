package com.sj;

public class MyThread extends Thread{
	int counter=0;
	
	
	
	
	public MyThread() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MyThread(String name){
		super(name);
	}
	
	
	
	@Override
	public void run() {
		/*
		 * if(Thread.currentThread().getName().equals("t1")) for(int i=0;i<11;i++) {
		 * System.out.println(i+"by t1"); } else for(int i=11;i<21;i++) {
		 * System.out.println(i+"by t2"); }
		 */
		if(Thread.currentThread().getName().equals("t1")) {
			System.out.println("inside t1");
			counter++;
			System.out.println("ctr"+counter+":t1");
		}
		if(Thread.currentThread().getName().equals("t2")) {
		{
			System.out.println("inside t2");
			counter--;
			System.out.println("ctr"+counter+":t2");
		}
		
		    try {
				Thread.sleep(100);
			    } catch (InterruptedException e) 
		       {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   }
		
	}

	}
}
