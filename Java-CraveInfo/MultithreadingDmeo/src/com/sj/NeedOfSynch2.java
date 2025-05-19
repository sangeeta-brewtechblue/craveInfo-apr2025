package com.sj;
class SharedObject
{
	//synchronized 
	synchronized public void print(String msg)
	{
		System.out.print("Hello");
		System.out.print("\t"+msg);
		
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.print("\t\tbye\n");
	}
}

class UseShared implements Runnable
{
	SharedObject s;
	Thread t;
	String msg;

	UseShared(SharedObject s,String msg)
	{
		this.s = s;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
		//synchronized(s)
		{
			s.print(msg);
		}
		//s.print(msg);
	}

}
class NeedOfSynch2
{
	public static void main(String args[])
	{
		SharedObject a1 = new SharedObject();

		UseShared obj1 = new UseShared(a1,"AAA");
		UseShared obj2 = new UseShared(a1,"BBB");
		UseShared obj3 = new UseShared(a1,"CCC");
		UseShared obj4 = new UseShared(a1,"DDD");
		UseShared obj5 = new UseShared(a1,"EEE");
		UseShared obj6 = new UseShared(a1,"FFF");
		UseShared obj7 = new UseShared(a1,"GGG");

	}
}


