import java.util.*;
class TreeSetDemo2{
	public static void main(String[] args){
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}

/*
output = [0, 5, 10, 15, 20]
*/
