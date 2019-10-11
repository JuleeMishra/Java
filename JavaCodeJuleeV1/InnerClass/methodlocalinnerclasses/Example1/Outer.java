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

*/
class Outer
{
	int a = 100;
	void m1()
	{
		class Inner
		{
			void innerMethod()
			{
				System.out.println("Inner Class Method");
			}
		}
		Inner i = new Inner();
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
