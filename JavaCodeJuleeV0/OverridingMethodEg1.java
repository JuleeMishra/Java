//overriden and overriding method signature must be same
class Parent {
	void marry() //overriden method
	{System.out.println("Black girl");}
}
class Child{
	void marry()//overriding method
	{System.out.println("Red girl");}
	public static void main(String[] args) {
		Child c = new Child();
		c.marry(); //new Child().marry();
	}
}