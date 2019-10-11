/* *************************************************************************************************************************
 * To check predefined method there is a javap command and to know how many method present in particular command use
 * "javap java.io.Serializable". Interface without methods is called "marker interface" . eg- java.io.Serializable, java.util.RandomAccess
 * java.lang.Cloneable
 * Running marker interfaces below:
 * D:\Academics\JavaFiles\JavaCodeJulee>javap java.io.Serializable
 * Compiled from "Serializable.java"
 * public interface java.io.Serializable {
 * }
 * 
 * D:\Academics\JavaFiles\JavaCodeJulee>javap java.util.RandomAccess
 * Compiled from "RandomAccess.java"
 * public interface java.util.RandomAccess {
 * }
 * So what is the use of interface without methods ?
 * Definition of marker Interface:
 * Interface without method. But whenever your class implementing interface your class must acquire some capabilities to perform some operation.
 * called marker Interface.
 * i.e Implementation of interface having no method with ultimate goal to acquire some capabilities to perform some operation.
 * To perform marker interface we need to know cloning i.e duplicate object creation.
 * To create duplicate object we have clone() method (clone method return type is object class) 
 * Initially for a class duplicate object creation is not allowed. If you want to perform duplicate object creation, your class must implement clonable 
 * interface.
 * So again, marker interface doesn't contains any method but whenever your class implementing cloneable marker interface your class is acquiring some
 * capabilities to perform cloning process.
 * Q: But Q is cloneable contains zero method so without methods how the class is acquiring the properties?
 * Ans: without methods capabilties of a class to acquire the properties are provided by JVM. eg- class acquiring cloning properties by cloneable 
 ***************************************************************************************************************************/
class Test implements Cloneable {
	int a = 10;
	int b = 20;
	public static void main(String[] args) throws Exception  
	{ 
		Test t = new Test();
		System.out.println(t.a);  // a = 10
		System.out.println(t.b);  // b = 20
		Test t1 = (Test)t.clone(); // t1 is the duplicate object.
		t.a = 100; // reassignment of a. Later after reassignment if we want to print value prior of reassignment we can use clone().  
		t.b = 200;
		System.out.println(t.a);  // a = 100
		System.out.println(t.b);  // b = 200
		System.out.println(t1.a);  // a = 10 // original value by referring duplicate object.
		System.out.println(t1.b);  // b = 20
	}
}
