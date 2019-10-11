/*
The methods by default is non-syncronised so multiple threads able to access the method at a time. example: If no que on ticket counter
allow many people to interact with single counter which results in data inconsistency(providing tickets, money exchange etc.)
So to overcome the problem we make a queue
If method declared as syncronise, only one thread able to access method at a time. So disadvantage is that last next thread have to wait
until the completion of first thread. So waiting time will increase and performance will decrease.
In non-syncronised method, multiple thread able to access one method at a time. So there is no wait time ultimately performancce will
increase but result in data inconsistency.
*/
class A 
{
	static synchronized void msg(String str) // remove synchronized modifier and check the result   
	{
		for (int i =0;i<5 ;i++ )
			{
				System.out.println("Hi " + str);
				try{Thread.sleep(1000);}
				catch(InterruptedException ie){ie.printStackTrace();}
			}
	}
}
class Thread1 extends Thread
{
	public void run() 
	{
		A.msg("Neetu");
	}
}

class  Thread2 extends Thread
{
	public void run() 
	{
		A.msg("Meenu");
	}
}
class  Thread3 extends Thread
{
	public void run() 
	{
		A.msg("Julee");
	}
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		new Thread1().start();
		new Thread2().start();
		new Thread3().start();
	}
}
/***

***/