/*
inside the enums it is possible to declare group of constants and constructors and main method
*/
enum Heroin
{
	Neetu, Meenu, Julee(10), Navneet, Satya ;
	Heroin()
	{
		System.out.println("0-arg constructor");
	}
	Heroin(int a)
	{
		System.out.println("1-arg Julee's constructor");
	}
	static void m1()
	{
		System.out.println("m1 method of enum");
	}
	public static void main(String[] args)
	{
		Heroin.m1();
	}
}

class Test
{
	public static void main(String... xyz) 
	{
		Heroin[] h= Heroin.values();
		for (Heroin hh:h)
		{
			System.out.println(hh.ordinal()+"------>"+hh);
		}
		
	}
}
