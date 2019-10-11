import java.util.*;
class LinkedHashSetDemo{
	public static void main(String[] args){
		LinkedHashSet l = new LinkedHashSet();
		l.add("z");
		l.add("A");
		l.add("B");
		l.add(null);
	    l.add(10);
		System.out.println(l.add("Z")); //false
		System.out.println(l); //
	}
}