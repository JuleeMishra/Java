// It is possible to change return type of method using covarient concept at class level.
class Animal
{}
class Dog extends Animal
{}
//Overriden and overriding method return type should be same at primitive level(byte,short,int,long,float,double,char,boolean.....primitive datatype).
class Parent {
	Animal marry() //void marry() //overriden method
	{
		System.out.println("Black girl");
		/*Animal a = new Animal();
		Animal a ;
		*/
		return new Animal();
	}
}
class Child extends Parent{
	Dog marry() //void marry()//overriding method
	{
		System.out.println("Red girl");
		/*Dog d = new Dog();
		return d ;
		*/
		return new Dog();
		}
	public static void main(String[] args) {
		/*Child c = new Child();
		c.marry();
		*/
		new Child().marry();
	}
}