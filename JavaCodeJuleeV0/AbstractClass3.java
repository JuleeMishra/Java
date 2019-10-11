/************************************************************************************************************************************************
 * Constructor rule (we have already discussed):
 * Constructor syntax:
 * Class Test{
 * Test()
 * {
 *-----constructor logic-----
 *}
*Test t = new Test(); //constructor logic is executed during object creation. 
*}
*when come to abstract class. Object creation of abstract class is not possible in java. So the above code will not give error.  
*
*abstract Class Test{
*Test()
*{
*-----constructor logic-----
*}
*Test t = new Test(); //object creation not possible for abstract class. So this line will show error.
*}
*
*Q: Inside abstract class object creation is not possible as we know, but inside abstract class is constructor declaration  possible ?
*Ans: Yes it is possible to write constructor declaration and logic inside abstract class.
***********************************************************************************************************************************************/

abstract class Test{
	Test()
	{
		System.out.println("abstract class constructor");
	}
	abstract void m1();

}
class Test1 extends Test
{
	void m1()
	{
		System.out.println("m1 method");
	}
	Test1()
	{
		super();
		System.out.println("normal class constructor");
	}
	public static void main(String[] args) {
		new Test1().m1();
	}
	}
