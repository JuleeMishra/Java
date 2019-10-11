//Static block are used to initialize the value of static variable
public class StaticBlockUse {
	static int eid;
	static {
		eid = 222 ; // at the time of class loading static block will  execute so inialized the value of eid
	}
	static void m1(){
		System.out.println(StaticBlockUse.eid);
		
	}
	public static void main(String[] args) {
		StaticBlockUse.m1();
	}

}
