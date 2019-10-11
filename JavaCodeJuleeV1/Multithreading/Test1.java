/*
Executing more than one task at a time is called multitasking. Mutithreading is executing more than one thread at a time.
Thread is separate independent part of the same application. Mutithreadig is very important for gamming applications.
There are two process to create your own thread in java. 1) extending thread class 2) Implementing runnable interface 
Both belong to java.lang package.
Single thread model
Multithread model.

Below example is for Single thread model .
Whenever main method start, one thread staarts automatically and this thread is called main thread.
*/

class Test1 //Single thread model
{
	public static void main(String[] args) //main thread
	{
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");// main thread execution
		System.out.println("Hello world");
		System.out.println("Hello world");
	}// main thread ended
}
