/**********************************************************************************************************************************************
 * Interfaces:
 * Example 3 
 **********************************************************************************************************************************************/

interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
	void m2();
	void m3();
}
// now below are the class implementation of interface IT1
abstract class Test implements IT1{
	public void m1(){System.out.println("m1 method");} // we get the error:  attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
}
abstract class Test1 extends Test{
	public void m2(){System.out.println("m2 method");} // we get the error:  attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
}
class Test2 extends Test1{
	public void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1();
		t.m2();
		t.m3();
	}
}


 