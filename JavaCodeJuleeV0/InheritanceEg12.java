class Parent {
	{System.out.println("Parent class Instance block");}
	Parent(){
		System.out.println("Parent class 0-arg constructor");
	}
	static {
	System.out.println("Parent class Static block ");
	}
	
}
class Child extends Parent{
	{System.out.println("Child class Instance block");}
	Child(){
		System.out.println("Child class 0-arg constructor");
	}
	static {
		System.out.println("Child class Static block ");
		}

	public static void main(String[] args) {
		new Child();
				
	}
}