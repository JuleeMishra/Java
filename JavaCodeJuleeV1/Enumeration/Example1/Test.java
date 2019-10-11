/**********************************************************************************************************************************************
Example: 1
1. This concept is introduced in 1.5 version
2. enumeration is used to declare group of named constant s.
3. we are declaring the enum by using enum keyword. For the enums the compiler will generate .classess
4.enum is a keyword and Enum is a class and every enum is directl child class of java.lang.Enum so it is not possible to inherit the some other class. Hence for the enum inheritance concept is not applicable
5. by default enum constants are public static final
Syntax:
enum Heroin
{
	samantha,tara,anu;
}

equivalent syntax:

enum Week
{ 
	public static final smantha;
    public static final tara;
	Public static final ubanu;
}

EX:-calling of enum constants individually

************************************************************************************************************************************************/
enum Heroin
{
	samantha,tara,anu;
}
class Test
{
public static void main(String... xyz)
	{
		Heroin s=Heroin.samantha;
		System.out.println(s);
		Heroin t=Heroin.tara;
		System.out.println(t);
		Heroin a=Heroin.anu;
		System.out.println(a);
	}
};
