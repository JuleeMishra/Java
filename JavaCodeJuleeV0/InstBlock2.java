// Inside one class it is possible to have multiple constructor but the execution will be top to bottom
public class InstBlock2 {
	InstBlock2(){
		System.out.println("0-arg constructor execution ");
	}
	InstBlock2(int a){
		System.out.println("1-arg constructor execution ");
	}
	{
		System.out.println("Instance block-1 execution ");
	}
	{
		System.out.println("Instance block-2 execution ");
	}
	public static void main(String[] args) {
		InstBlock2 t = new InstBlock2();
		InstBlock2 t1 = new InstBlock2(10);
		
		
	}
	

}
