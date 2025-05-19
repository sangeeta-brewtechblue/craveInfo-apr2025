package com.sj;

class NumberGenerator
{
	int i;

	synchronized public void increment() //synchronized 
	{
		for(i=0;i<=40;i++) //i<=20
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			 
			
		}
	}
};


class NeedOfSynch1 implements Runnable	// implements Runnable//extends Thread
{
	NumberGenerator ref;
	public NeedOfSynch1(NumberGenerator ref)//String name, 
	{
		this.ref = ref;
	}

	public void run()
	{
		ref.increment();
		
		/*
		 * synchronized(this) { ref.increment(); }
		 */
	}
	
	public static void main(String[] args) 
	{
		NumberGenerator obj = new NumberGenerator();

		NeedOfSynch1 a1 = new NeedOfSynch1(obj);
		//NeedOfSynch b1 = new NeedOfSynch(obj);

		//Thread t1 = new Thread(a1,"Frist");
		//Thread t2 = new Thread(b1,"Second");
		
		Thread t1 = new Thread(a1,"Frist");
		Thread t2 = new Thread(a1,"Second");
		//t1.setPriority(1);
		t1.start();
		t2.start();
		//t3.start();
	}
}



/*
class FirstThread extends Thread
{
	NumberGenerator ref;
	public FirstThread(String name, NumberGenerator ref)
	{
		super(name);
		this.ref = ref;
	}
	public void run()
	{
		ref.increment();
		
		synchronized(this)
		{
			ref.increment();
		}
		
	}

};

class SecondThread extends Thread
{
	NumberGenerator ref;
	public SecondThread(String name, NumberGenerator ref)
	{
		super(name);
		this.ref = ref;
	}
	public void run()
	{
		ref.increment();
		
		synchronized(this)
		{
			ref.increment();
		}
		
	}

};
*/