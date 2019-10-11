/*
In entire java whenever we are calling ref variable, internally it calls toString method. 
ToString belongs to object class. If object class toString is executed it returns class_name@hashcode.
If String class toString is executed, it returns content of the string object. If string buffer class toString s executed it returns content of
stringBuffer object.
When we call t.toString() compiler will check tostring method in ToStringMthd class like t.m1() but in below class there is no toString method
If test class doesn't contain any toString method then parent class toString is executed. If there is no parent in java then by default parent
class will be object class
*/
class ToStringMthd //extends object class
{
	public static void main(String[] args)
	{
	ToStringMthd t = new ToStringMthd();
	System.out.println(t); //ToStringMthd@15db9742
	System.out.println(t.toString());//  ToStringMthd@15db9742
	}
}

/* internally object class implementation shown like below
class Object
{
	public String toString()
	{
		return "class_name@hashCode";
	}
}
*/