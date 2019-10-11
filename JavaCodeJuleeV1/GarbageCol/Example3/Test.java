/*
gc():-
1) internally the garbage collector is running to destroy the useless objects.
2) by using gc() method we are able to call Garbage Collector explicitly by the developer.
3) gc() present in System class and it is a static method.
Syntax:- System.gc();
3) Whenevr garbage collector destroy useless objects just before destroying the objects the garbage collector call 
finalize() method on that object to perform final operation of particular object.


******************************************************************************************************************************************/

class Test
{
	public void finalize()
	{
		System.out.println("Destroyed");
	}
	public static void main(String[] args)
	{
		Test t1=new Test();
		Test t2=new Test();
		System.out.println(t1);
		System.out.println(t2);
		t1=null;
		t2=null;
		System.gc();
	}
};

/***
Test@15db9742
Test@6d06d69c
Destroyed
Destroyed
***/