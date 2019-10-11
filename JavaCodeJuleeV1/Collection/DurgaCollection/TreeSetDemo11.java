/*
if we depend on default natural sorting order compulsory the objects should be homogeneous and comparable, otherwise we will get runtime exception saying class-cast exception
If we define our own sorting by comparator then objects need not be comparable and homogeneous i.e we can add heterogeneous non-comparable objects also.

Q:  write a program to insert string and string buffer objects into TreeSet where sorting order is increasing length order.
If two objects having same length then consider their alphabetical order.

*/
import java.util.*;
class TreeSetDemo11{
	public static void main(String[] main){
		TreeSet t = new TreeSet(new myComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("XX");
		System.out.println(t);
	}
}

class myComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 < l2)
			return -1;
		else if(l1>l2)
			return +1;
		else
			return s1.compareTo(s2);
	}
}