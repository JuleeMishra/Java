import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		System.out.println(ll.size());
		//add the elements to the LinkedList
		ll.add("a");
		ll.add(10);
		ll.add(10.6);
		ll.addFirst("ratan");
		ll.addLast("anu");
		System.out.println("original content :"+ll);
		System.out.println(ll.size());
		//remove elements from LinkedList
		ll.remove(10.6);
		ll.remove(0);
		System.out.println("after deletion content :"+ll);
		System.out.println(ll.size());
		//remove first and last elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deletion of first and last :"+ll);
		//get and set a value
		int a=(Integer)ll.get(0);
		ll.set(0,a+"ratan");
		System.out.println("ll after change:"+ll);
	}
};
