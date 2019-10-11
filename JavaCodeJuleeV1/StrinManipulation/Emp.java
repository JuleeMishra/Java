/*
by default parent class of toString() method is object class
*/
class Emp 
{
	int eid;
	String ename;
	Emp(int eid, String ename)
	{
	this.eid = eid;
	this.ename = ename;
	}
	//overriding toString method
	public String toString()
	{
		return "emp id="+eid+" emp name="+ename ;
	}
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(111, "Julee");
		System.out.println(e1); //internally e1 first check if toString() is present in Emp class if not then it 
		// will Object class toString() and return hashcode
		System.out.println(e1.toString());
	}
}
