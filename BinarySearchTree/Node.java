public class Node <T> {
	private T val;
	private Node<T> left;
	private Node<T> right;

	public Node(T val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

	public Node(T val, Node<T> left, Node<T> right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public T getVal() {
		return this.val;
	}

	public Node<T> getLeft() {
		return this.left;
	}

	public Node<T> getRight() {
		return this.right;
	}


	public void setVal(T val) {
		this.val = val;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}
}
