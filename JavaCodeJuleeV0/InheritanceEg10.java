//Parent class Instance block
//example1: 
class Parent {
	{System.out.println("Parent class instance block");}
}
class Child extends Parent{
	{System.out.println("Parent class instance block");}

	public static void main(String[] args) {
		new Child(); //instance block executed during object creation only.
		//new Child();		
	}
}