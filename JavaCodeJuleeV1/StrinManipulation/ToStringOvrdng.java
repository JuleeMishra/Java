class ToStringOvrdng 
{
	int eid;
	String ename;
	ToStringOvrdng(int eid, String ename)
	{
	this.eid = eid;
	this.ename = ename;
	}
	public String toString()
	{
		return "emp id="+eid+" emp name="+ename ;
	}
	public static void main(String[] args) 
	{
		ToStringOvrdng e1 = new ToStringOvrdng(111, "Julee");
		System.out.println(e1);
		System.out.println(e1.toString());
	}
}
