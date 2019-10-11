/*
NullPointerException
If few values of array are null then we will get NullPointerException at run time. To overcome the problem we will write program like in Test3.java.
*/

class Test4
{
	public static void main(String[] args) 
	{
		
		Emp e1 = new Emp(222, "Neetu");
		Emp e2 = new Emp(111, "Meenu");
		Emp e3 = new Emp(222, "Satya");

		Emp[] e = new Emp[5] ; 
		e[0]=e1 ;
		e[2]=e2 ;
		e[4]=e3 ;

		for (Emp ee:e) // ee will store the value of array looping throug the for loop
		{
			System.out.println(ee.eid +"  "+ee.ename);
		}
	}
}
