package LinkedList;

public class Node <T>{
    private T val;
    private Node<T> pointer;

    public Node(T val) {
        this.val = val;
        this.pointer = null;
    }

    public Node(T val, Node<T> pointer) {
        this.val = val;
        this.pointer = pointer;
    }

    public T getVal() {
        return this.val;
    }

    public Node<T> getPointer() {
        return this.pointer;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void setPointer(Node<T> node) {
        this.pointer = node;
    }
}
