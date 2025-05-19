package com.sj;

public class JoinDemo  {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JoinThread jd = new JoinThread();
	}

}


class JoinThread extends Thread{
		Thread t1,t2;
		
	public JoinThread() {
			super();
			  t1 = new Thread(this);
	    	  t2 = new Thread(this);
	          t1.setName("t1");
	          t1.setPriority(1);         
	          t2.setName("t2");
	          t2.setPriority(10);
	 	      t2.start();
	 	      t1.start();
			
			// TODO Auto-generated constructor stub
		}

	public void run() {
		if(Thread.currentThread().getName().equals("t1")) {
		for ( int i=0;i<40;i++) {
			System.out.println(i);
		}
		}
		if(Thread.currentThread().getName().equals("t2")) {
			for ( int i=150;i<200;i++) {
				System.out.println(i);
			}
			}
		try {
			System.out.println("Join encountered"+Thread.currentThread().getName());
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
