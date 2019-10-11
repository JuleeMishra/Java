/*
Stop one thread until completion of another thread, we use join method.
When we call t2.join(time in ms) means t2 has to wait until completion of t1 thread.
*/
class MyThread extends Thread
{
	public void run()
	{
		for (int i=0;i<5 ;i++ )
		{
			System.out.println(Thread.currentThread().getName()+" User defined "+i);
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
		}
	}
}

class ThreadDemo 
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("Julee Thread");
		t1.start();
		try{t1.join(2000);} //main thread is executing this line, so main thread has to wait 2 seconds until the completion of t1 thread.
		//if t1 thread is not executed in 2 seconds then irregular results will come.
		catch(InterruptedException ie){ie.printStackTrace();}
		t2.start();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println(Thread.currentThread().getName()+" Main thread "+i);
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
		}
	}
}
/***

***/
