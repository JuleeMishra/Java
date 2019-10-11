//Overriden and overriding method return type should be same at primitive level(byte,short,int,long,float,double,char,boolean.....primitive datatype).
class Parent {
	float marry() //overriden method
	{
		System.out.println("Black girl");
		return 10.5f;
	}
}
class Child extends Parent{
	int marry()//overriding method
	{
		System.out.println("Red girl");
		return 10;
		}
	public static void main(String[] args) {
		Child c = new Child();
		c.marry(); //new Child().marry();
	}
}