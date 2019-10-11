/*
Instanceof operator:-
it is used check the type of the object.
Instanceof operator return Boolean value as a return value.
Syntax:- Reference-variable instanceof class-name
Ex:- Test t=new Test();
t instanceof Test
while using instanceof operator the reference variable and class Name must have some relationship (Parent-child or child-parent) otherwise compiler will raise compilation error.
if the reference variable is child of the specified classes at that situation instanceof return true
if the reference variable is parent of the specified classes at that situation instanceof return false.
*/
class Fruit
{
};
class Apple extends Fruit //Apple child of Fruit class
{
	public static void main(String[] args)
	{
		Apple a=new Apple();
		Object o=new Object();
		String str="ratan";
		Throwable t=new Throwable();
		System.out.println(a instanceof Fruit); //True
		System.out.println(a instanceof Object); //True
		System.out.println(o instanceof Apple); //False
		System.out.println(str instanceof Object); //True
		System.out.println(o instanceof Throwable); //False
		System.out.println(t instanceof Throwable); //True
		//System.out.println(t instanceof Apple);//compilation error
}
}
