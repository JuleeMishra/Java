/*
Array of object is able to hold any type of data i.e not only homogeneous data
*/
class Test10 
{
	public static void main(String[] args) 
	{
		Object[] o = new Object[3];
		o[0] = new Emp(111,"Julee");
		o[1] = new Student(117,"Kumari");
		o[2] = new Integer(10);
		
		for (Object oo:o)
		{
			if (oo instanceof Emp)
			{
				Emp e =(Emp)oo ;
				System.out.println(e.eid +"    "+e.ename);
			}
			if (oo instanceof Student)
			{
				Student s = (Student)oo;
				System.out.println(s.rollNo+"    "+s.sName);
			}
			if (oo instanceof Integer)
			{
				System.out.println(oo);
			}
		}
		
	}
}
