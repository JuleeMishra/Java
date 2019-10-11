/*
Arrays mainly have three steps:
a) Array declaration :                     eg:  str[] a;
b) Array instantiation or object creation: eg:  a = new str[n] ;
c) Array initialisation:                   eg:  str[0] = 10 ;
All the three steps can be performed in single statment also eg:
int[] a = {10,20,30,40,50} ;

*/

class Test2 
{
	public static void main(String[] args) 
	{
		System.out.println("Printing default value of int array");
		int[] a = new int[3];
		for ( int aa : a )
		{
		System.out.println(aa);
		}
		System.out.println("Printing default value of boolean array");
		boolean[] b = new boolean[3];
        for (boolean bb : b)
        {
		System.out.println(bb);
        }
		System.out.println("Printing default value of String array");
		A[] a1 = new A[3]; //creating object of A array. A is a class defined in some A.java file
		for (A a2: a1)
		{
		System.out.println(a2);
		}
		
	}
}
