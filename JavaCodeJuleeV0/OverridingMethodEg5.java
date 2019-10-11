// Final variables can not be modified
class Child {
	public static void main(String[] args) {
		final int a = 10; //local variable with final keyword
		a = a+10; // final variable a can not be modified
		System.out.println(a);
	}
}

Error:
OverridingMethodEg5.java:5: error: cannot assign a value to final variable a
                a = a+10; // final variable a can not be modified
                ^
1 error

