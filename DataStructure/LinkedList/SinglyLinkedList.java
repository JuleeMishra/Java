/*
Adding nodes to the linked list
*/

class Node{
	int value;
	Node next;
	
	public Node(int value){ //value of the particular node
		this.value = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	Node start; // class Node type which is defined above
	
	public void insert(int value){ //value we want to insert
		Node current = start; //current and start point to the same node.
		
		//keep looping until you find null in the next of current
		while(current.next != null){
			current = current.next // keep changing the value of current
		}
		//We only find null in the next of the current node when we reaches the last node
		Node newNode = new Node(value); //constructor of class Node
		current.next = newNode; //here null will be removed and newNode will be attached from current's next.
	}
	public static void main(){
		Scanner scan = new Scanner(System.in);
		int insertVal = scan.nextInt();
		SinglyLinkedList.insert(insertVal);
	}
}