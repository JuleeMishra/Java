/************************************************************************************************************************************
1. inside the enum it is possible to declare constructors. That constructors will be ececuted for each and every constant. 
   If we are declaring 5 constants then 5 times constructor will be executed.
2. Inside the enum if we are declaring only constants the semicolon is optional.
3. Inside the enum if we are declaring group of constants and constructors at that situation the group of constants must be 
   first line of the enum must ends with semicolon.

 Example: 3

**********************************************************************************************************************************8*/
enum Heroin
{
	Neetu, Meenu, Julee ,Navneet, Satya ;
	Heroin()
	{
		System.out.println("Neetu is eldest among all Heroins");
	}
}
class Test 
{
	public static void main(String... xyz) 
	{
		Heroin[] h = Heroin.values();
		for (Heroin hh : h)
		{
			System.out.println("Heroin contents: "+hh);
		}
	}
}
