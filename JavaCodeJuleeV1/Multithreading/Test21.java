/*
Volatile is a modifier which is only applicable to variables.
When a variable is volatile, one local copy of var is created for each thread. So when a thread try to perform modification of var
change is happened only in local copy, however master copy remains the same. Just before the termination of the modifying thread
master copy of var is updated. 
*/
class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/***

***/