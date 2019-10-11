import java.nio.charset.MalformedInputException;

/***************************************************************************************************************************
 * Interfaces:
 * Abstract class may or may not have abstract method but Interfaces always have only abstract method in it.                                                                                                                         
 * When coming to Interface, all the method only be abstract or public method. and by default interfaces are abstract. So for
 * interfaces object creation is not allowed in java.
 * So interfaces are only to highlight functionalities. Interfaces also called SRS Document() Implementation for the interfaces will be in class.
 * syntax of Interface:
 * 
 * Interface IT{  // by default this is abstract. After compilation of interface IT, IT.class file will be generated just like class compilation.
 *  void m1();   // by default this is abstract/public
 * }
 *  
 *********************************************************************************************************************/

interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
	void m2();
	void m3();
}
// now below are the class implementation of interface IT1
class Test implements IT1{
	void m1(){System.out.println("m1 method");} // we get the error:  attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
	void m2(){System.out.println("m2 method");}
	void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
	}
	}
	
	