// Calling class B and C who don't have their own main method
public class A {
	static
	{
		System.out.println("static block A");
	}
	public static void main(String[] args) throws ClassNotFoundException
	{
	    Class.forName("B");
		Class.forName("C");
	}

}
