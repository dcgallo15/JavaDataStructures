package LinkedList;

public class LinkedList <T>{
    private Node<T> head;
    public LinkedList(T startVal) {
        // head pointer default initialises to null
        this.head = new Node<T>(startVal);
    }

    public boolean isEmpty() {
        return (head.getPointer() == null);
    }

    public void append(Node<T> newNode) {
        Node<T> currentNode = this.head;
        while (currentNode.getPointer() != null) {
            currentNode = currentNode.getPointer();
        }
        currentNode.setPointer(newNode);
    }

    // Will remove first node with the same value
    public void remove(int val) {

    }

    public Node<T> getHead() {
        return this.head;
    }

    public void setHead(Node<T> head) {
       this.head = head;
    }

    public void printList() {
        Node<T> currentNode = this.head;
        while (currentNode.getPointer() != null) {
            System.out.print(currentNode.getVal());
            System.out.print(", ");
            currentNode = currentNode.getPointer();
        }
        System.out.println(currentNode.getVal());
    }
}
