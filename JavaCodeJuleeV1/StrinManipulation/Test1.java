class Test1
{
	Test1(String str){}
	public static void main(String[] args)
	{
	 // Object class equals executed which return ref-comp
     Test1 t1 = new Test1("Kumari");
	 Test1 t2 = new Test1("Kumari");
	 System.out.println(t1.equals(t2)); //false
	 
     // String class equals executed which return object content
	 String s1 = "Julee";
	 String s2 = "Julee";
	 System.out.println(s1.equals(s2)); //true
     
	 // StringBuffer class equals executed which return ref-comp
	 StringBuffer sb1 = new StringBuffer("Pankaj");
	 StringBuffer sb2 = new StringBuffer("Pankaj");
	 System.out.println(sb1.equals(sb2)); //false
	}
}

/*
class Object
{
	public boolean equals()
	{
	return "ref-comp";
	}
}

class String extends Object
{
	public boolean equals()
	{
	return "object content"; //override equals method of Object class
	}
}


class StringBuffer extends Object
{
	//Not overriding equals()
}
*/
