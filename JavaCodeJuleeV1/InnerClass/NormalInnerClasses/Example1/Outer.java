/****************************************************************************************************************************************
Static nested classes:- The nested classes declare as a static modifier is called static nested classes.
1. Static nested classes
    Non static nested classes:- these are called inner classes.
2. Normal inner classes
3. Method local inner classes
4. Anonymous inner classes

****************************************************************************************************************************************/

class Outer
{
	private int a=100;
	class Inner
	{
		void data()
		{
			System.out.println("the value is :"+a);
		}
	}
}
class Test
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.data();
	}
};
