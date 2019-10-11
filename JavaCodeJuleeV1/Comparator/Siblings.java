public class Siblings{
	String fname;
	String lname;
	int age;
	
	public Siblings(String fname,String lname,int age){
		this.fname=fname;
		this.lname=lname;
		this.age=age;
	}
	
	public boolean equals(Object o){
		if(o instanceOf Siblings)
			Siblings another = (Siblings)o;
			if(this.fname.equals(another.fname) &&
			this.lname.equals(another.lname) &&
			this.fname.age(another.age))
			return true;
			
	}
	
	
	public static void main(String[] args){
		Siblings s1 = new Siblings("Neetu","Kumari",41);
		Siblings s2 = new Siblings("Meenu","Kumari",36);
		Siblings s3 = new Siblings("Navneet","Kumari",33);
		Siblings s4 = new Siblings("Neetu","Kumari",41);
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
	}
}