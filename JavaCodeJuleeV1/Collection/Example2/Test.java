/*
Collection:- It is a group of individual object as a single entity.
Collection framework: To represent collection several classes and interfaces are required which can be used to represent a group of object as 
single entity called Framework
Collection is the root interface of all collections. So all methods present in Collection interface is available to all collections.
Check methods in : java.util.Collection.

All implemented class in collection have different types of characteristics. All characteristic vary from class to class:
1) Version: ArrayList(1.2) , LinkedList(1.2),Legccy(1.0) 
2) Heterogenous Data: All collection class contains heterogenous data except
Treeset and TreeMap
3) Duplicate object: is allowed
4) Null Insertion: some classes allow and some not
5) Insertion order: some classes preserved Insertion order and some not
6) Methods are sync/nonSync
7) Data structure: Collection support predefined data.
8) Cursor: used to retrieve data from collection. Every class support  different cursor.
Ex:- ArrayList with generics
***********************************************************************************************************************************/
import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Size of al: "+ al.size());
		al.add("Julee");
		al.add("Nitu");
		al.add("Meenu");
		al.add("Satya");
		
		System.out.println("content of ArrayList: "+ al);
		System.out.println("Size of al: "+ al.size());

		// toArray copies content into other array
		String[] a=new String[al.size()];
		al.toArray(a);
		
		for (String aa:a)
		{
			System.out.println(aa);
		}

	}
}



