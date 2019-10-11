class Test2 
{
	public static void main(String[] args) 
	{
		//conversion of String to StringBuffer
		String s1 = "Julee" ;//We would like to perform revarse printing of s1 i.e eeluJ
		StringBuffer sb1 = new StringBuffer(s1);
		System.out.println(sb1.reverse());

		//conversion of StringBuffer to String
		StringBuffer sb2 = new StringBuffer("Kumari");
		//String ss = sb2.toString();
		System.out.println(sb2);

	}
}
