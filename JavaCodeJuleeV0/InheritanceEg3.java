class Parent {
	Parent(){System.out.println("Parent class 0-arg m1 constructor");}
}
class Child extends Parent{
	Child()
	{
		this(10);// while executing Child class 0-arg constructor I would like to call child constructor with 1-arg
		System.out.println("Child class 0-arg constructor");
	}
	Child(int a)
	{
		super();
		System.out.println("Child class 0-arg constructor");
	}
	public static void main(String[] args) {
		new Child();
		
	}
}
