/*
if we depend on default natural sorting order compulsory the objects should be homogeneous and comparable, otherwise we will get runtime exception saying class-cast exception
If we define our own sorting by comparator then objects need not be comparable and homogeneous i.e we can add heterogeneous non-comparable objects also.
*/
import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){
		TreeSet t = new TreeSet(new myComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}
}
class myComparator implements Comparator{
	public int compare(Object obj1, Object Obj2){
		String s1 = obj1.toString();
		String s2 = Obj2.toString();
		return s1.compareTo(s2);
	}
}

//output: [A, K, L, Z]