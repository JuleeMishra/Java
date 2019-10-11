/* *************************************************************************************************************************
 * Netsed interface 
 * map.entry method where map is main class and entry is sub interface
 * 
 ***************************************************************************************************************************/
interface A{
	interface It2{
		void m1();
	}
}
class Test implements A.It2{  //map.entry where map is main class and entry is sub interface
	public void m1(){System.out.println("m1 method");}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		new Test().m1();
	}
	
}