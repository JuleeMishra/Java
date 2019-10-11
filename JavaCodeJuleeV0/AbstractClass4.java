/*****************************************************************************************************************************************************
* Keep two points in mind for the following example about instance and static block
* 1) Instance block executed whenever the object is created
* 2) Static block executed only one time for each class load. i.e every time the class file created only once the static block executed.
* If you have written instance block and static block in abstract class. This block only executed by creating object in the child class.
*****************************************************************************************************************************************************/

abstract class Test{
	Test()
	{
		System.out.println("abstract class constructor");
	}
	{System.out.println("abstract Test class Instance block");}
	static{System.out.println("abstract Test class static block");}
	
}
class Test1 extends Test{
	Test1()
	{
		super();
		System.out.println("normal class constructor");
	}
	public static void main(String[] args) {
		new Test1();
		new Test1();
	}
	
}

