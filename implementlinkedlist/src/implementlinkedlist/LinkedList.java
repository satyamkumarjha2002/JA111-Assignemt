package implementlinkedlist;

public class LinkedList {
	Node head;
	public LinkedList() {
		this.head=null;
	}
	//function to add element head at the linked lsit;
	public void insertAtHead(int data) {
		if(head==null) {
			head = new Node(data);
			return ;
		}
		Node new_head=new Node(data);
		new_head.next=head;
		head=new_head;
		return;
		
	}
	//function to add an element tail at the linked list. 
	public void insertAtTail(int data) {
		if(head==null) {
			head = new Node(data);
			return ;
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=new Node(data);
		return ;
	}
	//method to delete element from the linked list;
	public void deleteNOde(int data) {
		Node current=head;
		while(current.next.data!=data) {
			current=current.next;
		}
		current.next=current.next.next;
		return;
	}
	//method to print the linked list;
	public void printLinkedList() {
		Node current=head;
		if(head==null) return;
		while(current!=null) {
			System.out.println(current.data+" ");
			current=current.next;
		}
		return ;
	}
}
