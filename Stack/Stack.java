import LinkedList.LinkedList;
import LinkedList.Node;

class Stack <T> {
	private LinkedList<T> list;
	public Stack(T startVal) {
		list = new LinkedList<T>(startVal);
	}

	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem, list.getHead());
		list.setHead(newNode);
	}

	public T pop() {
		Node<T> ret = list.getHead();
		list.setHead(ret.getPointer());
		return ret.getVal();
	}

}
