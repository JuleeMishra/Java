/*
Multiple threads and different task.
Here 3 threads performing 3 different task
Whenever thread is completed stack memory is destroyed
*/
class  MyThread1 extends Thread
{
	public void run(){
		System.out.println("Hi Julee-1");}
}

class  MyThread2 extends Thread
{
	public void run() {
		System.out.println("Hi Julee-2");}
}

class  MyThread3 extends Thread
{
	public void run() {
		System.out.println("Hi Julee-3");}
}

class ThreadDemo 
{
	public static void main(String[] args)
	{
	MyThread1 t = new MyThread1();
	t.start();

	MyThread2 t1 = new MyThread2();
	t1.start();

	MyThread3 t2 = new MyThread3();
	t2.start();
	}
}
/***
Hi Julee-1
Hi Julee-2
Hi Julee-3
***/