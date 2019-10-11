class Test 
{
	public static void main(String[] args) 
	{
		String s1 = "Julee";
		System.out.println(s1);//userdefined class ref variable calls toString method internally and returns hashCode
		System.out.println(s1.toString());

		StringBuffer sb1 = new StringBuffer("Satya");
		System.out.println(sb1);
		System.out.println(sb1.toString());
	}
}
