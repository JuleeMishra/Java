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
