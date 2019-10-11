class Parent {
	void m1(){System.out.println("parent m1()");;
	}
}
class Child extends Parent{
	private void m1(){System.out.println("Child m1()");}//overriding method
}
class Test{
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();
	}
}