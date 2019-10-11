//if parent and child class have the same method then priority goes to
//child class.
class Parent {
	void m1(){System.out.println("Parent class m1 method");}
}
class Child extends Parent{
	void m1(){System.out.println("Child class m2 method");}
	void m2()
	{
		this.m1(); // ti distinguish the methods use keyword "this" and "super"
		super.m1();
	}
	public static void main(String[] args) {
		new Child().m2();
	}
}
