// Every time the constructor called, instance block will get executed each time.
public class InstBlock1 {
	InstBlock1(){
		System.out.println("0-arg constructor execution chk");
	}
	InstBlock1(int a){
		System.out.println("1-arg constructor execution chk");
	}
	InstBlock1(int a,int b){
		System.out.println("2-arg constructor execution chk");
	}
	{
		System.out.println("Instance block execution chk");
	}
	public static void main(String[] args) {
		InstBlock1 t = new InstBlock1();
		InstBlock1 t1 = new InstBlock1(10);
		InstBlock1 t2 = new InstBlock1(10,20);
		
	}
	

}
