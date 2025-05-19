package com.sj;

public class WaitNotifyDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WorkMerge demo = new WorkMerge();
	}

}

class WorkMerge extends Thread{
	Thread t1,t2,t3;
	int x1,x2,x3;
	
	public WorkMerge() {
		x1=10;
		x2=10;
		x3=10;
		t1 = new Thread(this,"t1");
		t2 = new Thread(this,"t2");
		t3 = new Thread(this,"t2");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void run() {		
		
		increment();
		
	}
	
	public void increment() {
		for(;;) {
		if(Thread.currentThread()==t1) {
			if(x1<400)
			x1=x1+10;
			
			
			else {
			synchronized(this) {
				try {
					wait();
					x1 =10;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			System.out.print("x1"+x1);
		}
		if(Thread.currentThread()==t2) {
			if(x2<400)
			x2=x2+10;
			else {
			synchronized(this) {
				try {
					wait();
					x2 =10;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("x2"+x2);
		}
		if(Thread.currentThread()==t3) {
			if(x3<400)
			x3=x3+10;
			else {
			synchronized(this) {
				notifyAll();
				x3 =10;
			}
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("x3"+x3);
		}
		}
	}
	
	
	
}