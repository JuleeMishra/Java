import java.util.*;
class TreeSetDemo6{
	public static void main(String[] args){
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Neetu");
		t.add("Meenu");
		t.add("Julee");
		t.add("Chhoti");
		t.add("Navneet");
		t.add("Pankaj");
		System.out.println(t);  //output [Neetu]
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = (String)obj1 ;
		String s2 = obj2.toString() ;
		//return -s1.compareTo(s2); //[Pankaj, Neetu, Navneet, Meenu, Julee, Chhoti]
		//return s2.compareTo(s1); //[Pankaj, Neetu, Navneet, Meenu, Julee, Chhoti]
		return s1.compareTo(s2); //[Chhoti, Julee, Meenu, Navneet, Neetu, Pankaj]
		
	}
}
