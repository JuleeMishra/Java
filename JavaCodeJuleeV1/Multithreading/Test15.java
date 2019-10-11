/*
interrupt method can only be able to interrupt those method which are in sleep mode.
*/
class MyThread extends Thread
{
	public void run()
	{
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("User defined thread " + i);
			try{Thread.sleep(4000);}
			catch(InterruptedException ie){System.out.println("thread Interrupted");}
			
		}
	}
	
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		t1.start();
		t1.interrupt();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("Main thread");
		}
	}
}
/***

***/