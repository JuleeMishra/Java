/*
Arrays mainly have three steps:
a) Array declaration :                     eg:  str[] a;
b) Array instantiation or object creation: eg:  a = new str[n] ;
c) Array initialisation:                   eg:  str[0] = 10 ;
All the three steps can be performed in single statment also eg:
int[] a = {10,20,30,40,50} ;

*/
class Test3 
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
			

		
		for (Object o: e) // Here e contains null data also. so to hold null data we use type of Object
		{
			System.out.println("Check value of o " + o);
			
			if (o instanceof Emp) /* instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface)
			check if object class o is of type Emp class
			*/
			{
				// System.out.println("Accessing o: "+o->eid+"  "+o->ename); array member cannot be accessed by var of object type 
				Emp ee = (Emp)o;
				System.out.println("Accessing o typecast to Emp: "+ee.eid+"  "+ee.ename);
			}
			if (o == null)
			{
				System.out.println(o+"  "+o);
			}
			
		}
	}
}
