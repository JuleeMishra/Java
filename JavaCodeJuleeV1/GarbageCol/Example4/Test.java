/*
If user call finalize() method explicitly in that situation exception is raised.





****************************************************************************************************************************************/
class Test
{
	public void finalize()
	{
		System.out.println("Object not destroyed");
		int a=10/0;
	}
	public static void main(String[] args)
	{
		Test t1=new Test();
		Test t2=new Test();
		t1=t2;
		t2.finalize();
	}
};
/***
Object not destroyed
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.finalize(Test.java:14)
        at Test.main(Test.java:21)
***/