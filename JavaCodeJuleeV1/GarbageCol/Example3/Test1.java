/*
Approach-3 :-whenever we are creating objects inside the methods once method is completed the objects are elgible for garbage collector.


********************************************************************************************************************************/

class Test1
{
	public void finalize()
	{
		System.out.println("object destroyed");  //object destroyed
	}
	void m1()
	{
		Test1 t1=new Test1();
		Test1 t2=new Test1();
	}
	public static void main(String[] args)
	{
		Test1 t=new Test1();
		t.m1();
		System.gc();
	}
};