/*
equals vs '==' operator :
== operator always return boolean due to ref-comparison
equals() returns ref-comp(for object and stringBuffer), Content comp (for String class)

length vs length()
length is a variable use to find out length of the array
length() is a method used to find out size of string.

*/
class Test4 
{
	public static void main(String[] args) 
	{
        //length vs length()
		int[] a= new int[100];
		System.out.println(a.length); //100

		String str = "Julee";
		System.out.println(str.length());//5
	}
}
