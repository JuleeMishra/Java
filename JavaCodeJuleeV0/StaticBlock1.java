// static block will executed only one time while creation of .class file by JVM. Instance block are executed every time during 
// object creation
public class StaticBlock1 {
	{
		System.out.println("Instance block-1 execution ");
	}
	{
		System.out.println("Instance block-2 execution ");
	}
	static 
	{
		System.out.println("Static Block-1 execution ");
	}
	static 
	{
		System.out.println("Static Block-2 execution ");
	}
	
	public static void main(String[] args) {
			
		
	}
	

}
