class Parent
{
private void m1(){System.out.println("parent m1()");
}
}
class Child extends Parent
{
	void m1(){System.out.println("Child m1()");}//overriding method
	
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		
	}
	}