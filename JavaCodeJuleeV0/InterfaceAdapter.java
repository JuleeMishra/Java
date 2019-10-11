 /* *************************************************************************************************************************
 * Limitation of interfaces:
 * There is a problem in implementing(overriding) some methods among abstract method present in Interface.
 * Let say if 5 method present in one interface then we need to implement(override) all methods. 
 * 
 * So if we want to implement only 2 method among 5 methods of interface, we have to go for "adapter class"
 * 
 ***************************************************************************************************************************/
interface It1{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}
class X implements It1{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
}
class Test implements It1{
	public void m1(){System.out.println("m1 method");}
	public void m2(){System.out.println("m2 method");}
	public void m3(){System.out.println("m3 method");}
	public void m4(){System.out.println("m4 method");}
	public void m5(){System.out.println("m5 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		
	}
}
