class Test7 
{
	public static void main(String[] args) 
	{
		int[] s = new int[10];
		s[0]= 10;
		s[1]= 11;
		s[2]= 12;
		s[3]= 13;
		s[4]= 14;
		s[5]= 15;
		s[6]= 16;
		s[7]= 17;
		s[8]= 18;
		s[9]= 19;
		int evenNo = 0;
		int oddNo = 0;
		

		for (int i=0;i< s.length ; i++ )
		{
			if (s[i]%2 == 0)
			{
				evenNo = s[i] ;
				System.out.println("List of even numbers "+evenNo);
				
			}
				
			if (s[i]%2 != 0)
			{
				oddNo = s[i] ;
				System.out.println("List of odd numbers "+oddNo);
				
			}
			
		}
		
	}
}
