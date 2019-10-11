/*
Collections:-
1) collection can hold both homogeneous data and heterogeneous data
2) collections are growable in nature
3) Memory wise collections are good. Recommended to use.
4) Performance wise collections are not recommended to use .

**********************************************************************************************************************************************/
import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args)
	{
		//Creation of arraylist
		ArrayList al = new ArrayList();
		System.out.println("Size of Array: "+ al.size());
		//Insertion of object into arraylist
		al.add("Neetu");
		al.add("Neetu");
		al.add("Meenu");
		al.add("Julee");
		al.add(null);
		al.add("Navneet");
		al.add("Satya");
		System.out.println("Size of Array: "+ al.size());
		//Print elements of arraylist
		System.out.println("Print Elements of ArrayList: "+ al);
		


	}
}