import java.util.*;
class TreeSetDemo5{
	public static void main(String[] args){
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		// return -1; //output = [20, 20, 5, 15, 0, 10] reverse order
		//return +1 ; //[10, 0, 15, 5, 20, 20]  maintain insertion order
		return 0 ;    // output = [10]     insert 1st element only and all remains duplicate
	}
}

/*

*/

