import java.util.*;
class HashSetDemo{
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.add("Julee");
		l.add("Neetu");
		l.add("Minu");
		l.add("Chhoti");
		System.out.println(l);
		ListIterator itr = l.listIterator();
		while(itr.hasNext()){
			String s = (String)itr.next();
			if(s.equals("Julee")){
				itr.remove();
			}
			else if(s.equals("Chhoti")){
				itr.set("Chhoti Bhehna");
			}
			else if(s.equals("Neetu")){
				itr.set("Baddi Didi");
			}
		}
		System.out.println(l);
	}
}