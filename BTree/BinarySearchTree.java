class BinaryTree {
	class Node {
		public Node left;
		public Node right;
		public int data;
		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public void insert(int val, Node current) {
		// Case of inserting root node
		if (current == null) {
			current = new Node(val);
			return;
		}

		if (current.left == null && val < current.data) {
			current.left = new Node(val);
			return;
		}

		if (current.right == null && val > current.data) {
			current.right = new Node(val);
			return;
		}

		if (val < current.data) {
			insert(val, current.left);
		} else if (val > current.data) {
			insert(val, current.right);
		} else {
			System.out.println(current.data);
			System.out.println("EXCEPTION!!");
		}
	}
}
