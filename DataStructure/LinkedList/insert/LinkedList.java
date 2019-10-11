package pkg1;

public class LinkedList {
	Node head;
	
	public void insert(int value){
		//creating a new node with the value user have passed 
		Node newNode = new Node();
		newNode.data=value;
		newNode.next=null;
		
		//what if the new node we are inserting will be the first node in list
		if(head==null){
			head = newNode;
		}else{
			//create a node n and make it as head. Purpose: to traverse to the next nodes.
			Node n =  head; 
			while(n.next!=null){
				n = n.next;
			}
			n.next=newNode;
		}
	}
	
	public void display(){
		Node node = head;
		while(node.next!=null){
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
