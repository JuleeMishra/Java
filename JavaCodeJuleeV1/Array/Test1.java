/*
Arrays mainly have three steps:
a) Array declaration :                     eg:  str[] a;
b) Array instantiation or object creation: eg:  a = new str[n] ;
c) Array initialisation:                   eg:  str[0] = 10 ;
All the three steps can be performed in single statment also eg:
int[] a = {10,20,30,40,50} ;

*/
class  Test1
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50};

		//1st approach to access array data
		System.out.println("1st approach result");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		//2nd approach to access array data by for
        System.out.println("2nd approach result");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

		//3rd approach to access array data by for
		System.out.println("3rd approach result");
		for (int u : a)
		{
			System.out.println(u);
		}
		
	}
}
