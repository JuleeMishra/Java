/*
comapreTo and equaals mehod difference
*/
class Test3 
{
	public static void main(String[] args) 
	{
		// String equals() method ----> return boolean value
		String s1 = "Julee";
		String s2 = "Mishra";
		String s3 = "Julee";
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println("Pankaj".equals(s3));//false

		// String compareTo() method ----> return int value
		System.out.println(s1.compareTo(s2));// -ve
		System.out.println(s1.compareTo(s3));// 0
		System.out.println(s2.compareTo(s3));// +ve
		System.out.println("julee".compareTo(s3));// +ve (32)
		System.out.println("julee".compareToIgnoreCase(s3));// 0

	}
}
