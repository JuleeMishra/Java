/*
Creating thread by two different ways
*/
class MyThread extends Thread 
{
	public void run() 
	{
		System.out.println("First approach to create a thread");
	}
}

class MyRunnable implements Runnable 
{
	public void run() 
	{
		System.out.println("Second approach to create a thread");
	}
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();
		
		/*
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		*/
		new Thread(new MyRunnable()).start();

	}
} 
 
/***

***/