/*
Transient modifier used to prevent serialisation due to security reason. transient keyword in Java. transient is a variables modifier used in serialization. ... When JVM comes across transient keyword, it ignores original value of the variable and save default value of that variable data type.
*/
import java.io.*;
class Emp implements Serializable //performing serialisation of emp class
{
	int eid;
	transient String ename; // if you don't want to send ename through network and to prevent serialisation 
	Emp(int eid, String ename) 
	{
		this.eid = eid;
		this.ename = ename;
		
	}
}
