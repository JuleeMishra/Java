//overloaded constructors
class Test {
	Test(int a){System.out.println("int constructor");}
	Test(int a, int b){System.out.println("int int constructor");}
	Test(char a){System.out.println("char constructor");}
	public static void main(String[] args) {
		Test t = new Test(10);
		Test t1 = new Test(10,20);
		Test t2 = new Test('a');
		}

}
