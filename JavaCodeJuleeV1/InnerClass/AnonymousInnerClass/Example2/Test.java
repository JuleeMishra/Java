/************************************************************************************************************************************
Anonymous Inner Class:- 
1. The name less inner class is called anonymous inner class.
2. it can be used to override/provide the implementation of normal class or abstract class or interface
3. it is possible to provide abstract method implementations by taking inner classes.

*************************************************************************************************************************************/
abstract class Animal{
		abstract void eat();
	};
class Test{
	Animal a=new Animal(){
		void eat()
		{
			System.out.println("animals eating gross");
		}
	};
	public static void main(String[] args)
	{
		Test t=new Test();
		t.a.eat();
	}
}

/*
// Same implementation with another way
abstract class Animal{
		abstract void eat();
	};
class Test
{
	public static void main(String[] args)
	{
		Animal a=new Animal() // Anonymous class
		{
			void eat()
			{
				System.out.println("animals eating gross");
			}
		};
	a.eat();
	}
}
*/