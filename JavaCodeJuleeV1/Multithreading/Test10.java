/*
set the name of thread and get name of thread
priority range of thread is 1-10 and default is 5
If multiple thread have same priority then priority is decided by threadschedulaar which shows unexpcted behaviour always.
*/
class MyThread extends Thread 
{
	public void run() 
	{
	}
}

class ThreadDemo 
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
		MyThread t3 = new MyThread();
		t3.start();
		System.out.println(t1.getName());
		t1.setName("JuleeThread-0"); // set name of thread
		System.out.println(t1.getName()); //// get name of thread
		System.out.println(Thread.currentThread().getName()); //// get name of thread
		Thread.currentThread().setName("MainThread");// set name of thread
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getId()); //// get name of id of thread
		System.out.println(t1.isAlive());// check if thread is running or alive
		System.out.println(Thread.activeCount());// check the number of active thread in application. Number may differ after every run
		
	}
}
/***
Thread-0
JuleeThread-0
main
MainThread
11
false
1
***/