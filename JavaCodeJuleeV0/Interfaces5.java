/***************************************************************************************************************************
  *Interface...
 *Example 5
 *we can apply inheritance properties on interface also .
 *        class extends class
 *        interface extends interface
 *        class implements interface
 * 
 *****************************************************************************************************************************/
interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
}
interface IT2 {  // Here to acquire the property of IT1 use extend keyword with IT2
	void m2();
}
interface IT3 extends IT1,IT2{  // extends multiple interface at a time.
	void m3();
}
class Test implements IT3{
	public void m1(){System.out.println("m1 method");}
	public void m2(){System.out.println("m2 method");}
	public void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		IT3 t = new Test();
		t.m1();
		t.m2();
		t.m3();
		
	}
}

 