/*******************************************************************************************************************************************************
 *Interface...
 *we can apply inheritance properties on interface also .
 * POINTS TO BE NOTED:
 * one class can be able to extents ot inherit one class at a time but one interface can extend or inherit more than one interface at a time.
 * 
 * 
 ******************************************************************************************************************************************************/
interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
}
interface IT2 extends IT1{  // Here to acquire the property of IT1 use extend keyword with IT2
	void m2();
}
interface IT3 extends IT2{
	void m3();  // So IT3 have m1,m2 and m3 methods.
}
class Test implements IT3{
	public void m1(){System.out.println("m1 method");}
	public void m2(){System.out.println("m2 method");}
	public void m3(){System.out.println("m3 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
		
	}
}

 