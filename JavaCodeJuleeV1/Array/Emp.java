/*
Arrays mainly have three steps:
a) Array declaration :                     eg:  str[] a;
b) Array instantiation or object creation: eg:  a = new str[n] ;
c) Array initialisation:                   eg:  str[0] = 10 ;
All the three steps can be performed in single statment also eg:
int[] a = {10,20,30,40,50} ;

*/

class Emp 
{   // instance variable
	int eid ;
	String ename;
	Emp(int eid, String ename)
	{// conversion of local variable to instance  var. 
		this.eid = eid;
		this.ename = ename;
	}
}
