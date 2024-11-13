class Node {
	public Node left;
	public Node right;
	public int data;
	public int height;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
		height = 0;
	}
}

class AVLTree {
	private Node root;

	public AVLTree(int data) {
		root = new Node(data);
	}

	// returns height if not null
	private int height(Node N) {
		if (N == null) {
			return 0;
		}
		return N.height;
	}

	// returns biggest of a or b
	private int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// left rotates subtree with root passed in
	private Node leftRotate(Node N) {
		Node ret = N.right;

		// swap
		Node tmp = ret.left;
		ret.left = N;
		N.right = tmp;

		N.height = max(height(N.left), height(N.right)) + 1;
		ret.height = max(height(ret.left), height(ret.right)) + 1;

		return ret;
	}

	private Node rightRotate(Node N) {
		Node ret = N.left;

		// swap
		Node tmp = ret.right;
		ret.right = N;
		N.left = tmp;

		N.height = max(height(N.left), height(N.right)) + 1;
		ret.height = max(height(ret.left), height(ret.right)) + 1;

		return ret;
	}

	private int calcBalance(Node N) {
		if (N == null) {
			return 0;
		}
		return height(N.left) - height(N.right);
	}

	// TODO!!!
	public void insert() {


	}

	public void preOrder(Node current) {
		if (current == null) {
			return;
		}
		System.out.println(current.data);
		inOrder(current.left);
		inOrder(current.right);
	}


	public void inOrder(Node current) {
		if (current == null) {
			return;
		}
		inOrder(current.left);
		System.out.println(current.data);
		inOrder(current.right);
	}


	public void postOrder(Node current) {
		if (current == null) {
			return;
		}
		inOrder(current.left);
		inOrder(current.right);
		System.out.println(current.data);
	}



}
