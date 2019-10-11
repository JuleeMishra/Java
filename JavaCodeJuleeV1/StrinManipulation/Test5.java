/*
String class methods example
*/
class  Test5
{
	public static void main(String[] args) 
	{
		String str = "Julee";
		System.out.println(str.charAt(2)); //1
		// System.out.println(str.charAt(20));    StringIndexOutOfBoundsException
		System.out.println(str.indexOf('e')); //3
		System.out.println(str.lastIndexOf('e'));  //4

		String str1 = "07R81A0525" ;
		System.out.println(str1.contains("07R"));  //true
		System.out.println(str1.startsWith("07R"));  //true
		System.out.println(str1.startsWith("07Reeee"));  //false
		System.out.println(str1.endsWith("07R"));  //false

		System.out.println("julee".toUpperCase());  //JULEE
		System.out.println("JULEE".toLowerCase());  //julee

		String s1 = "   Julee   ";  
		System.out.println(s1.length());   //11
		System.out.println(s1.trim().length());  //5
	}
}
