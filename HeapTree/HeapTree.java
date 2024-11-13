class Node {
	Node left;
	Node right;
	int val;

	public Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

class BinaryHeapTree {
	Node root;

	public BinaryHeapTree(int val) {
		root = new Node(val);
	}

	public Node getRoot() {
		return this.root;
	}

	private void bubbleUp(Node n) {
		int tmp;
		boolean swap = false;
		if (n == null) {
			return;
		}

		if (n.left != null) {
			if (n.left.val < n.val) {
				tmp = n.val;
				n.val = n.left.val;
				n.left.val = tmp;
				swap = true;
			}
		}
		if (swap == false && n.right != null) {
			if (n.right.val < n.val) {
				tmp = n.val;
				n.val = n.right.val;
				n.right.val = tmp;
			}
		}
		bubbleUp(n.left);
		bubbleUp(n.right);
	}

	public void heapify(int[] arr) {
		root = genTree(arr, new Node(arr[0]), 0);
		bubbleUp(root);
	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.val);
		preOrder(root.left);
		preOrder(root.right);
	}


	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.val);
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.val);
		inOrder(root.right);
	}

	private Node genTree(int[] arr, Node root, int i) {
		if ((2 * i) + 1 >= arr.length) {
			return root;
		}
		i = 2 * i;
		root.left = new Node(arr[i + 1]);
		if (i + 2 < arr.length) {
			root.right = new Node(arr[i + 2]);
		} else {
			root.right = null;
		}

		root.left = genTree(arr, root.left, i + 1);
		root.right = genTree(arr, root.right, i + 2);
		return root;
	}
}
