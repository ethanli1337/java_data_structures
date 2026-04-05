package datastructures;

public class Main {
    
    public static void main(String[] args) {
        LinkedList linked = new LinkedList(1);
        // linked.getHead();
        // linked.getTail();
        // linked.getLength();

        // linked.append(2);
        // linked.append(3);
        // linked.printList();
        System.out.println(linked.removeLast().value);
        linked.printList();
    }
}
