// Instance block will run first then constructor will execute
public class InstBlock {
	InstBlock(){
		System.out.println("0-arg constructor execution");
	}
	{
		System.out.println("Instance block execution");
	}
	public static void main(String[] args) {
		new InstBlock();
	}
	

}
