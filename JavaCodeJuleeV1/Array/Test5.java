class Test5
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(111, "Pankaj") ;
		Emp e2 = new Emp(222, "Neetu")  ;
		Emp e3 = new Emp(333, "Meenu")  ;
		Emp e4 = new Emp(444, "Julee")  ;
		Emp e5 = new Emp(555, "Satya")  ;
		Emp e6 = new Emp(666, "Navneet");
		

		Emp[] e = new Emp[6];
		e[0]=e1;
		e[2]=e2;
		e[3]=e3;
		e[5]=e5;
		

		
		for (int i=0; i<e.length; i++)
		{
			
			if (e[i] == null)
			{
				System.out.println(i);
			}
		}

		
	}
}
