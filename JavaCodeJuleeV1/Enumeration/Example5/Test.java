/*
inside the enum it is possible to provide main method.
*/

enum Heroin
{
	Neetu, Meenu, Julee, Navneet, Satya ;
	public static void main(String[] args)
	{
		System.out.println("Enum main method");
	}
}

class Test
{
	public static void main(String... xyz) 
	{
		Heroin[] h= Heroin.values();
		for (Heroin hh: h)
		{
			System.out.println(hh);
		}
	}
}
