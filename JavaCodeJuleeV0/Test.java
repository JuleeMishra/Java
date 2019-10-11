public class Test {
	Test(){
		System.out.println("0-argumen constructor");
		
	}
	Test(int a){
		System.out.println("1-argument constructor");
	}
	Test(int a, int b){
		System.out.println("2-argument constructor");
	}
	public static void main(String[] args) {
		//named approach
		Test t = new Test();
		Test t1 = new Test(10);
		Test t2 = new Test(10,20);
		//Nameless approach
		new Test();
		new Test(10);
		new Test(10,20);
		
	}

}