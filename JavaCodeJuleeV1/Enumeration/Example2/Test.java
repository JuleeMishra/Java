/***************************************************************************************************************************************
Example: 2
1. printing the enumeration constants by using for-each loop.
2. values() methods are used to print all the enum constants.
3. ordinal() is used to print the index values of the enum constants.

****************************************************************************************************************************************/

enum Heroin //group of named constants
{
	samantha,tara,anu; //enum constants
}
class Test
{
	public static void main(String... xyz)
	{
		Heroin[] s=Heroin.values();
		for (Heroin s1:s)
		{
			System.out.println(s1.ordinal()+"----"+s1);
		}
	}
};