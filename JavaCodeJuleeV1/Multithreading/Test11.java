/*
priority must set before the start of creating thread

*/
class MyThread extends Thread 
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
		//System.out.println(Thread.currentThread().getPriority());
	}
}
class ThreadDemo 
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		t1.setPriority(Thread.MIN_PRIORITY);
		
		MyThread t2 = new MyThread();
		t2.setPriority(Thread.MAX_PRIORITY);
		
		MyThread t3 = new MyThread();
		t3.setPriority(Thread.NORM_PRIORITY);
		
		MyThread t4 = new MyThread();
		t4.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
/***

***/