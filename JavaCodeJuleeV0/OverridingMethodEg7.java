//Polymorphism part 3:  By using P i.e P reference var we will be able to call only overrided method but direct method of child class can be accessed using "type casting"(conversion of parent to child type with ref var of child class)
class Parent
{
void m1(){System.out.println("parent m1()");//overridden method
}
}
class Child extends Parent
{
	void m1(){System.out.println("Child m1()");}//overriding method
	void m2(){System.out.println("Child m2()");}//direct method
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1(); /*compile time compiler will check m1() method in Parent class so m1() is available in parent class.but at runtime Child class object is created. So Child class is executed here.
       // p.m2(); compile time error. so using P it is able to access only override method of Child object */
	    Child c = (Child)p;/* It generates error message. Becauze first compiler will check m2()method in parent class at compile time. Here m2() is not available in parent class here. 		
		conversion of parent to child type with ref var of child class */
		c.m2();
	}
	}