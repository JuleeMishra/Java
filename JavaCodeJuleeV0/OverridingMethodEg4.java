// Final methods overriding is not possible
class Parent {
	final void marry() //overridden method
	{System.out.println("Black girl");}
}
class Child extends Parent{
	void marry() //overriding method
	{System.out.println("Red girl");}
	public static void main(String[] args) {
		/*Child c = new Child();
		c.marry();
		*/
		new Child().marry();
	}
}