import java.util.*;
class HashSetDemo{
	public static void main(String[] args){
		HashSet h = new HashSet();
		h.add("z");
		h.add("A");
		h.add("B");
		h.add(null);
	    h.add(10);
		System.out.println(h.add("Z")); //false
		System.out.println(h); //
	}
}