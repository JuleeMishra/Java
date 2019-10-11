/*
Example4:
Ex:- constructors with arguments
*/
enum Heroin
{
	Neetu, Meenu, Julee(29), Navneet, Satya(10,20) ;
	Heroin()
	{
		System.out.println("Eldest among all is Neetu");
	}
	Heroin(int a)
	{
		System.out.println("Julee constructor:"+ a);
	}
	Heroin(int a,int b)
	{
		System.out.println("Satya constructor:"+ a +", "+ b);
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Heroin[] h = Heroin.values();
		for (Heroin hh: h)
		{
			System.out.println(hh);
		}
		
	}
}
