/*
Multiple threads can perform single task
Here 3 threads(t1,t2 and t3) performing single task
*/
class  MyThread extends Thread
{
	public void run() 
	{
		System.out.println("Hi Julee");
	}
	
}

class ThreadDemo extends MyThread
{
	public static void main(String[] args)
	{
	MyThread t = new MyThread();
	t.start(); //1st thread

	MyThread t1 = new MyThread();
	t1.start(); //2nd thread

	MyThread t2 = new MyThread();
	t2.start();//3rd thread
	}
}
/***
Hi Julee
Hi Julee
Hi Julee
***/