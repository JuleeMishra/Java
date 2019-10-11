/* *************************************************************************************************************************
 * when you have two interfaces with same variable name and when we trying to implement both interfaces in a class
 * and try to print the value of variable. It will show ambiguity problem.
 * 
 ***************************************************************************************************************************/
interface It1{ // abstract
	    int a = 10; //public static final
}
interface It2{ // abstract
    int a = 99; //public static final
}
class Test implements It1,It2{ 
	public void m1(){
		System.out.println(It1.a);
		System.out.println(It2.a);} // to remove ambuiguity problem we can refer interfacename.var
	     
	public static void main(String[] args) {
		new Test().m1();
		
	}
	
}