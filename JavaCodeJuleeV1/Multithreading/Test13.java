/*
Threads which are executing at background called Daemon threads. Daemon threads are threads running at background to give 
support to foreground Threads.
Whenever main thread stops , Daemon thread automatically stops the execution whether completed or not.
*/
class MyThread extends Thread
{
	public void run() 
	{
		for (int i=0;i<10 ;i++ ) //Daemon thread run only 4 times because main tread runs here 4 times
		{
			System.out.println("Daemon thread");
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}

		}		
	}
}

class ThreadDemo 
{
	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();

		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Main thread");
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
		}
		
	}
}
/***

***/