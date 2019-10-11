// if keyword "this" or "super" not used in constructor then comiler will generate super() constructor on the top of each called
//constructor
class Parent {
	Parent(){System.out.println("Parent class 0-arg  constructor");}
}
class Child extends Parent{
	//super(); compiler generated code
	Child()
	{
		System.out.println("Child class 0-arg  constructor");
	}
	Child(int a)
	{
		//super(); compiler generated code
		System.out.println("Child class 1-arg  constructor");
	}
	
	public static void main(String[] args) {
		new Child();
		new Child(10);
	}
}