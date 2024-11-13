class BinaryTree {
	private Node<Integer> root;

	public BinaryTree(int initialVal) {
		root = new Node<Integer>(initialVal);
	}

	public Node<Integer> getRoot() { return this.root; }

	// NOTE: current should be set to root on initial call
	public void insert(int val, Node<Integer> current) {
		// Case of inserting root node
		if (current == null) {
			current = new Node<Integer>(val);
			return;
		}

		if (current.getLeft() == null && val < current.getVal()) {
			current.setLeft(new Node<Integer>(val));
			return;
		}

		if (current.getRight() == null && val > current.getVal()) {
			current.setRight(new Node<Integer>(val));
			return;
		}

		if (val < current.getVal()) {
			insert(val, current.getLeft());
		} else if (val > current.getVal()) {
			insert(val, current.getRight());
		} else {
			System.out.println(current.getVal());
			System.out.println("EXCEPTION!!");
		}
	}

	// NOTE: val must be in the tree
	public void delete (int val) {
		// Finds Node before node to delete
		Node<Integer> toRemove = root;
		// Leaf Node case
		if (toRemove.getLeft() == null || toRemove.getRight() == null) {
			toRemove = null;
		} else if (toRemove.getLeft() == null) { // One Child (Left)
			toRemove = toRemove.getLeft();
		} else if (toRemove.getRight() == null) { // One Child (Right)
			toRemove = toRemove.getRight();
		} else { // Two children
			Node <Integer> iter = toRemove; // causes issues with copies I think
			while (iter.getLeft() != null) {
				iter = iter.getLeft();
			}
			iter = toRemove.getLeft();
			System.out.println("HERE!");
			toRemove = toRemove.getRight();
		}
		root = toRemove;
	}


	public void preOrder(Node<Integer> current) {
		if (current == null) {
			return;
		}
		System.out.println(current.getVal());
		preOrder(current.getLeft());
		preOrder(current.getRight());
	}


	public void inOrder(Node<Integer> current) {
		if (current == null) {
			return;
		}
		inOrder(current.getLeft());
		System.out.println(current.getVal());
		inOrder(current.getRight());
	}


	public void postOrder(Node<Integer> current) {
		if (current == null) {
			return;
		}
		postOrder(current.getLeft());
		postOrder(current.getRight());
		System.out.println(current.getVal());
	}
}
