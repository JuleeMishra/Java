class Parent {
	void marry() //overriden method signature
	{System.out.println("Black girl");}
}
class Child extends Parent{
	void marry()//overriding method signature
	{System.out.println("Red girl");}
}
class Test{
	public static void main(String[] args) {
		Child c = new Child();
		c.marry(); //new Child().marry();
	}
}