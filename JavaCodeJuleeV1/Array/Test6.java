class Test6 
{
	
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,80,30};
		int sum = 0;
		int GreaterNo= a[0];
		int SmallerNo= a[0];
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i] > GreaterNo)
			{
				GreaterNo = a[i] ;				
												
			}	
			
			else if (a[i] < SmallerNo)
			{
				SmallerNo = a[i] ;				
				
			}		
			
			a[i]=a[i]+sum ;
			sum = a[i] ;
			
		}
		System.out.println("Smaller number is : "+ SmallerNo);		
	    System.out.println("Greater number is : "+ GreaterNo);
		System.out.println("Summation of ArrayS: "+ sum);
		
		
	}
}
