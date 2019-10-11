/*
method local inner classes example:
class Outer
{
	void m1()
	{
		class inner
		{
		};
	}
};
In method local inner classes it is not possible to call the non-final variables inside the inner classes hence we must declare that 
local variables must be final then only it is possible to access that members.

*/
class Outer
{
	private int a=100;
	int b=200;
	void m1()
	{
		int c = 300;
		final int d=400;
		class Inner
		{
			void innerMethod()
			{
				System.out.println("method local inner classes");
				System.out.println(a+10);
				System.out.println(b+10);
				System.out.println(c+10);
				System.out.println(d+10);
			}
		};
		Inner i=new Inner();
		i.innerMethod();
	}
};

class Test
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.m1();
	}
};
