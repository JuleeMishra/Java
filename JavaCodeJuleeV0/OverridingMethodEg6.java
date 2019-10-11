
public class Test {
	int a=100; // not a final
	void m1()// this will be final because to check if it is final we need to 
	// create child class which is not possible
	{
		a = a+10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		new Test().m1();
	}
}

	
