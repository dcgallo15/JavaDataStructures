import LinkedList.LinkedList;
import LinkedList.Node;

class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        LinkedList<Integer> list = new LinkedList<>(2);
        System.out.println(list.isEmpty());
        // Lots of implied types in java very strange
        list.append(new Node<>(5));
        list.append(new Node<>(6));
        list.append(new Node<>(7));
        list.printList();
    }
}
