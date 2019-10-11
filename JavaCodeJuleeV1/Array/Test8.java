class  Test8
{
	int[] m1() // method return type int array 
	{
		System.out.println("m1() method");
		int[] a ={10,20,30,40,50};
		return a;
	}
	void m2(double[] d)
	{
		System.out.println("m2() method");
		for (double dd: d)
		{
			System.out.println(dd);
		}
	}
	public static void main(String[] args) 
	{
		Test8 t= new Test8();
		int[] x = t.m1();
		for (int xx:x)
		{
			System.out.println(xx);
		}

		double[] d = {10,4,20,5,30,6};
		t.m2(d);
		
	}
}
