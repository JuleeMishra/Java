/*
If you don't override run() then Thread class run method will execute which is having empty implementation.
t.start --> it will check start method in MyThread class if not available it will be checked in Thread class(parent class). Whenever Thread class start
method executed your thread(here MyThread) is registered into thread schedular.
start method is pesent in Thread class with empty implementation but is responsible for registering our thread to schedular. 
*/
class MyThread extends Thread 
{
	//there is no overring on run() method
}

class ThreadDemo 
{
	public static void main(String[] args)
	{
		MyThread t= new MyThread();
		t.run();
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
***/