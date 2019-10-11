/*
difference between start() method and run() method:
t.start(): responsible for registering thread to thread scheduler.
t.run(): it is like calling normal method in java. so thread is not created
*/
class MyThread extends Thread 
{
	public void run() 
	{
		for (int i = 0;i<3 ;i++ )
		{
			System.out.println("User defined thread") ;
		}
	}
}

class ThreadDemo 
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread();
		//t.run();
		t.start();
		for (int i=0; i<5 ;i++ )
		{
			System.out.println("Main thread");
		}
	}
}
/***
Main thread
Main thread
Main thread
Main thread
Main thread
User defined thread
User defined thread
User defined thread
***/