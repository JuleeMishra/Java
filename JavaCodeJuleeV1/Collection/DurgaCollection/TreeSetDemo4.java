import java.util.*;
class TreeSetDemo4{
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
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		//return I1.compareTo(I2);     // output [0, 5, 10, 15, 20]
		//return -I1.compareTo(I2);    // output [20, 15, 10, 5, 0]
		//return I2.compareTo(I1);       // output [20, 15, 10, 5, 0]
		return I2.compareTo(I1);       // output [0, 5, 10, 15, 20]
	}
}


