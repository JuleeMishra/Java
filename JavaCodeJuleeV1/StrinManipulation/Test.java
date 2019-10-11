class Test 
{
	public static void main(String[] args) 
	{
		String s1 = "Julee"; // 
		System.out.println(s1);//Julee
		System.out.println(s1.toString()); // Julee

		StringBuffer sb1 = new StringBuffer("Satya");
		System.out.println(sb1); //Satya
		System.out.println(sb1.toString()); //Satya
	}
}

/*
According to toString() method s1 should print hashcode but what happening here is
String class internally extending object class which override the implementatation of string class

Internally string class structure is:



*/

/*
class Object 
{
	public String toString()
	{
		return "Class_name@hashCode" ;
	}
}

class String extends object
{
	public  String toString()
	{
	return "Content of the string object" ;
	}
}

class StringBuffer extends object
{
	public  String toString()
	{
	return "Content of the StringBuffer object" ;
	}
}
*/
/*
when we call object class toString method it will return Class_name@hashCode
but when we call String class toString() method it will print Content of the string object.
As we know String class toString method override the method with String class method implementation

*/