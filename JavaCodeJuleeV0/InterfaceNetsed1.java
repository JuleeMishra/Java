/* *************************************************************************************************************************
 * Netsed interface 
 * It is possible to declare interface insde interface
 * 
 ***************************************************************************************************************************/
interface It1{
	interface It2{
		void m1();
	}
}
class Test implements It1.It2{  //map.entry where map is main interface and entry is sub interface
	public void m1(){System.out.println("m1 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		new Test().m1();
	}
	
}