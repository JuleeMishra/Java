// inside child class we can call superclass constructor. It must be the first statement.
class Parent {
	// if no constructor is written then it means that it have 0-arg constructor with empty implementation. and it will not generate any error even while called by child class
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