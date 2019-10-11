class A1 
{	void m1(){System.out.println("m1 method");}
	void m2(){System.out.println("m2 method");}
}
class B1 extends A1
{	void m3(){System.out.println("m3 method");}
	void m4(){System.out.println("m4 method");}
}
class c1 extends B1 
{	void m5(){System.out.println("m5 method");}
	void m6(){System.out.println("m6 method");}
	public static void main(String[] args) 
	{	A1 a = new A1();
		a.m1();a.m2();
		B1 b = new B1();
		b.m3(); b.m4();b.m1();b.m2();
		c1 c = new c1();  // object should be created for child class
		c.m1();c.m2();c.m3();c.m4();c.m5();c.m6();
	}
}
