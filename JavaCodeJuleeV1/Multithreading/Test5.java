/*
start method is pesent in Thread class with empty implementation which is only responsible for registering our thread to schedular. 
But when start method is present in MyThread class , t.start() would not be able to invoke Thread class start(). so we would not 
be able to create our own thread class because of no registration.
*/
class MyThread extends Thread 
{
	public void start() //override start method present in Thread class
	{
		for (int i=0; i<5 ;i++ )
		{
			System.out.println("User defined thread class");
		}
		
	}
}
class ThreadDemo 
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();

		for (int i=0; i<5 ;i++ )
		{
			System.out.println("Main method thread class");
		}
	}
}
/***
User defined thread class
User defined thread class
User defined thread class
User defined thread class
User defined thread class
Main method thread class
Main method thread class
Main method thread class
Main method thread class
Main method thread class
***/