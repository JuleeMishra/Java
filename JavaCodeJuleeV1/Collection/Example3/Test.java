/*
LinkedList:-
Class LinkedList extends AbstractSequentialList implements List,Deque,Queue
1) Introduced in 1.2 v
2) Duplicate objects are allowed
3) Null insertion is possible
4) Heterogeneous objects are allowed
5) The under laying data structure is double linked list.
6) Insertion ode is preserved.

Ex:-LinkedList with generics.
*/
import java.util.*;
class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		System.out.println("Before insertion size is: "+ll.size());
		//add the elements to the LinkedList
		ll.add("Julee");
		ll.add(29);
		ll.add(null);
		ll.add(10);
		ll.add("Satya");
		System.out.println(ll);
		//remove elements from LinkedList
		ll.remove("Julee");
		System.out.println("After removal"+ll);
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("After removal of first and last"+ll);
		//get and set a value
		ll.set(0,"Satya");
		int a = (Integer)ll.get(1);
		ll.set(1,a+"Julee");
		System.out.println(ll);
	}
}
