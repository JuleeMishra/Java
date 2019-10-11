abstract class Test{
abstract void m1(); // Abstract method only highlights services and implemetation will be in child class
abstract void m2();
abstract void m3();
void m4(){System.out.println("m4() method");}
}
class Test1 extends Test{// Here we will be able to create object of Test1 and take the advantage of writing implementation of abstract class.
	void m1(){System.out.println("m1 method ");}
	void m2(){System.out.println("m2 method ");}
	void m3(){System.out.println("m3 method ");}
	public static void main(String[] args) {
		//Test t = new Test(); //  error: Test is abstract; cannot be instantiated
		Test1 t = new Test1();
		t.m1();
		t.m2();
		t.m3();
		//Parent p = new child();
		Test t1 = new Test1(); // this is possible. Becauze we are only referencing abstract class not generating object of abstract class.
        t1.m1(); //During compile time:  compiler check method in parent class.  	Run Time: Test1 object is created so test1 method is executed.
        t1.m2(); // Compile: Test  Run Time: Test1 
        t1.m3(); // Compile: Test  Run Time: Test1 		
	}
}