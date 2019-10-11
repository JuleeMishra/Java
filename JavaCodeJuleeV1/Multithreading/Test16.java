/*
2nd approach to create a thread using implementing Runnable class
*/
class MyRunnable implements Runnable 
{
	public void run() 
	{
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("User defined Thread "+i);
		}
	}
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		MyRunnable r = new MyRunnable();
		// r.start(); // it is not possible because start() is not present in Runnable class. 
		Thread t = new Thread(r);//we call Thread class which have start method and pass r variable to it.
		t.start(); // r class is registered in the thread scheduler

		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Main Thread "+i);
		}
		
	}
}
/***

***/