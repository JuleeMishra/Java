class Outer
{
	static int i=100;
	void m1()
	{
		//j=j+10;// compilation error
		//System.out.println(j);//compilation error
		System.out.println("m1 method");
	}
	class Inner
	{
		int j=200;
		void m2()
		{
			i=i+10;
			System.out.println("Inner class I: "+i);
		}
	};
};
class Test
{
	public static void main(String[] args)
	{
		Outer a=new Outer();
		System.out.println(Outer.i);
		a.m1();
		Outer.Inner b=a.new Inner();
		System.out.println(b.j);
		b.m2();
		//b.m1(); compilation error
	}
};