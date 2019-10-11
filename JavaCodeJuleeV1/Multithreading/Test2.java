/*
Step 1
Our normal java class becomes thread class whenever we extend thread
class MyThread extends Thread 
{}

Step 2
Thread class is always present with empty implementation. So overriding the thread class with run() method to write the logic. 
class MyThread extends Thread 
{
	public void run()
	{.......thread logic....}
} 

Step 3
Once logic is ready. Instantiate thread class
MyThread t = new MyThread();

Step 4
After instantiating. Start the thread with start() method
t.start();

If application contains more than one thread. Thread execution decided by thread scheduler(component of JVM)
Thread scheduler internally follow two algorithm to delocate the CPU
1) Primtive algorithm
2) Time slicing Algorithm


Responsibilities
-----------------
1) Register thread class to thread scheduler
2) start() will invoke run() first

*/

class MyThread extends ThreadDemo // Multithread model 
{
	public void run() 
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("user defined thread");
		}
	}
}

class ThreadDemo
{
	public static void main(String[] args) //main thread
	{  //user thread start code
		MyThread t = new MyThread();
		t.start(); /* 2 threads.start() method available in thread class which is responsible for registering MyThread class 
        to thread scheduler*/
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main thread");
		}
	}
}
/***
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
user defined thread
user defined thread
user defined thread
user defined thread
user defined thread
user defined thread
user defined thread
user defined thread
user defined thread
user defined thread
***/