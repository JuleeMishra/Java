class  StringConcat
{
	public static void main(String[] args) 
	{
		String s1 = "Satya" ;
		s1.concat(" Kumari");
        System.out.println(s1); //Satya
		System.out.println(s1.concat(" Kumari")); //Satya Kumari
		String s2 = new String("Julee");
		s2.concat(" Kumari");
		System.out.println (s2.concat(" Kumari")); // Julee Kumari
		StringBuffer sb = new StringBuffer("Pankaj");
		System.out.println(sb.append(" Jha")); //Pankaj Jha
	}
}
