/* *************************************************************************************************************************
 * Netsed interface 
 * It is possible to declare variable inside interface
 * map.entry method where map is main class and entry is sub interface
 * 
 * 3 points to remember:
 * 1) Interfaces are by default abstract
 * 2) Interface methods by default are public abstract
 * 3) Interface variable by default are public static final
 * we get error here as :  error: cannot assign a value to final variable a
 ***************************************************************************************************************************/
interface It1{ // abstract
	    int a = 10; //public static final
		void m1(); //public abstract
}
class Test implements It1{ 
	public void m1(){
		a = a+ 10;
		System.out.println(a);}
	public static void main(String[] args) {
		Test t = new Test(); //or new Test().m1();
		t.m1();
		
	}
	
}
