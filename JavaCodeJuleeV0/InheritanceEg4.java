// inside child class we can call superclass constructor. It must be the first statement.
class Parent {
	Parent(){System.out.println("Parent class 0-arg constructor");}
}
class Child extends Parent{
	Child()
	{
		super();// inside child class we can call superclass constructor. It must be the first statement.
		System.out.println("Child class 0-arg constructor");
	}
	
	public static void main(String[] args) {
		new Child();
		
	}
}
