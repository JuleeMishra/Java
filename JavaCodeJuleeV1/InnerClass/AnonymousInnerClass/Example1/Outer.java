/************************************************************************************************************************************
Anonymous Inner Class:- 
1. The name less inner class is called anonymous inner class.
2. it can be used to provide the implementation of normal class or abstract class or interface
3. it is possible to provide abstract method implementations by taking inner classes.

*************************************************************************************************************************************/
abstract class Test
{
	abstract void m1();
};
class OuterClass
	{
		void m2(){
			System.out.println("m2 method");
		}
		Test t=new Test() // Anonymous inner class
		{
			void m1(){
				System.out.println("annonymus inner class");
			}
		};
};
class Demo
{
	public static void main(String[] args)
	{
		OuterClass o=new OuterClass();
		o.m2();
		o.t.m1();
	}
};
