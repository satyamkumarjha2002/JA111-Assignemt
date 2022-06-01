package implementlinkedlist;

public class Node {
	int data;
	Node next;

//constructor
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	// method to print the node;

	public void printNode() {
		System.out.println(this.data + "->" + this.next);
	}
}
