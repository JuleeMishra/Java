/*
If we wanted to run multiple task at a time we will call all the task inside run()
*/
class  MyThread extends Thread
{
	public void run() 
	{
		System.out.println("inside run method");
		m1();
		m2();
	}
	void m1(){System.out.println("m1 method ");}
	void m2(){System.out.println("m2 method ");}
}

class ThreadDemo 
{
	public static void main(String[] args)
	{
	MyThread t = new MyThread();
	t.start();
	}
}
/***
inside run method
m1 method
m2 method
***/