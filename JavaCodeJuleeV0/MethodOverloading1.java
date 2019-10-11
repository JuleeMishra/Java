//Method overloading
class Test {
	void m1(){
		System.out.println("Method with 0-arg");
	}	
	void m1(int a){
		System.out.println("Method with 1-arg");
	}	
	void m1(char a){
		System.out.println("Method with 1-arg but diff data type");
	}	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1('a');
	}

}
