class Parent 
{
	static void m1(){System.out.println("static parent m1() method") ; }
	// void m1(){System.out.println("parent m1() method") ; } // p.m1() will print overriding method i.e child m1() method 
}
class Child extends Parent
{
	void m1(){System.out.println("child m1() method") ; } 
	void m2(){System.out.println("child m2() method") ; }
	public static void main(String[]args)
	{
	
	   
		Child c = new Child(); // runtime: child c  ::   compile time: new child() 
		c.m1();
		c.m2();

		Parent p = new Child(); // runtime: child c  ::   compile time: new child() 
		p.m1();
	  //p.m2();                // not able to access m2()
	    Child c1 = (Child)p ;  // to access m2() we do typecasting i.e converting p ref varible to c type 
		c1.m2();

		
	
	    

		
	}

}

/*  parent and child both have same method name and Child c = new Child(); c.m1();  ----> 
 Both methods will give same result except 1st method will not access m2() method

  Child c = new Child(); // runtime: child c  ::   compile time: new child() 
		c.m1();
		(Child)p
		*/
