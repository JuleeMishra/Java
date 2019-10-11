/*
Thread method always calls 0-arg run() method by default.However 1-arg run() can be called explicitly.
*/
class MyThread extends Thread 
{
	public void run() //override run method present in Thread class
	{
		for (int i=0; i<4 ;i++ )
		{
			System.out.println("0-arg run method");
		}
		run(10); //explicit call of 1-arg run method.
	}
	public void run(int a) //override run method present in Thread class
	{
		for (int i=0; i<3 ;i++ )
		{
			System.out.println("1-arg run method");
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
Main method thread class
Main method thread class
Main method thread class
Main method thread class
Main method thread class
0-arg run method
0-arg run method
0-arg run method
0-arg run method
1-arg run method
1-arg run method
1-arg run method
***/