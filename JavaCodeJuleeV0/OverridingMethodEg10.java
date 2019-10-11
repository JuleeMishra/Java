/*Overriding ruleno. 7 
case1: Same level 
*/
class Parent
{
void m1(){System.out.println("parent m1()");
}
}
class Child extends Parent
{
	void m1(){System.out.println("Child m1()");}//overriding method
	
	}