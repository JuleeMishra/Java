/**********************************************************************************************************************************************
 * Resolving error of Interface IT1:
 * compilation error: attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
 * 
 * Child class method trying to reduce the permission of parent class method by overridding.
 *
 * As part of rule of overriding concept, We need to keep in mind that Java allows only same level or higher level of overriding.
 * Meaning Parent child class always have same level or higher level of access than parent methods.
 * So in case of  Interfaces2.java Test methods are of default(which have only one pkg access) while IT1 interface methods are of
 * Public type (public can have all pkg access).
 * So to make child class same or more accessible than parent class we need to add modifier as "Public" to child class methods.
 *  
 **********************************************************************************************************************************************/

interface IT1{  //by default interface is abstract type
	void m1();   //by default method is public abstract type
	void m2();
	void m3();
}
// now below are the class implementation of interface IT1
class Test implements IT1{
	public void m1(){System.out.println("m1 method");} // we get the error:  attempting to assign weaker access privileges; was public. so check Interfaces2.java to resolve the problem
	public void m2(){System.out.println("m2 method");} // this method by default is default. Which have less privilege from public. So we need to convert default to public or higher accessible modifier.
	public void m3(){System.out.println("m3 method");} // Now this program will execute.
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
		IT1 i = new Test(); // so interfaces also able to hold implementation class object.
		i.m1();
		i.m2();
		i.m3();
	}
	
}
 
	