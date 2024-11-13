//NOTE: Root has pointer to next element only
class DoublyLinkedList {
	class Node {
		public Node front; // front pointer
		public Node back; // back pointer
		public int data;

		public Node(Node front, Node back, int data) {
			this.front = front;
			this.back = back;
			this.data = data;
		}
	}

	private Node root;

	public doublyLinkedList(int initalVal) {
		root = new Node(null, null, initalVal);
	}

	public Node getRoot() { return this.root; }

	public void insert(int newVal, Node startNode) {
		while (startNode.front != null) {
			startNode = startNode.front;
		}
		startNode.front = new Node(null, startNode, newVal);
	}
}

