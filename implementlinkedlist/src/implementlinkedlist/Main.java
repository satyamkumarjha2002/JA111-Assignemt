package implementlinkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		for (int i=1;i<=5;++i) {
			linkedList.insertAtTail(i);
		}
		linkedList.insertAtHead(8);
		linkedList.insertAtHead(3);
		linkedList.insertAtHead(3);
		linkedList.deleteNOde(3);
		linkedList.printLinkedList();
	}

}
