/*
Static inner classes:-Declaring the static class inside the another class is called static inner class.
Static inner classes can access only static variables and static methods it does not access the instace variables and instance methods.

Syntax:- 
class Outer
{
	static class Inner
	{
	};
};

**********************************************************************************************************************************************/
class Outer
{
	static int a=10;
	static int b=20;
	//int d=40;
	static class Inner
	{
		int c=30;
		void m1()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			//System.out.println(d); // error: non-static variable d cannot be referenced from a static context
		}
	};
	public static void main(String[] args)
	{
		Outer o=new Outer();
		Outer.Inner i=new Outer.Inner();
		i.m1();
	}
};