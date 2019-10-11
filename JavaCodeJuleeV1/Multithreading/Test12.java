/*
Life cycle of thread:
when you create an object of thread it is in new/bond state at the time of statrting the thread it comes into ready state(TS allocates CPU) Then after registering into TS Thread comes into running mode. Finally when thread completes its run then it comes into dead state.

Hook thread is like a normal thread which executed just before termination of JVM either normally or abnormally.
*/
class MyThread extends Thread
{
	public void run() 
	{
		System.out.println("Hook Thread");
	}
}

class ThreadDemo 
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();// I'd like to make this thread as hook thread 
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t); //addShutdownHook method belongs to runtime class. To make MyThread as hook thread use addShutdownHook()

		for (int i=0;i<5 ;i++ )
		{
			System.out.println("main thread");
			try{Thread.sleep(1000);} //just to check if hook is printed at last with interruption of application
			catch(InterruptedException ie){ie.printStackTrace();}
		}
	}
}
/***
main thread
main thread
main thread
main thread
main thread
Hook Thread
***/