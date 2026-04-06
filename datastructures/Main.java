package datastructures;

public class Main {
    
    public static void main(String[] args) {
        LinkedList linked = new LinkedList(1);
        linked.append(2);
        System.out.println(linked.removeFirst().value);
        System.out.println(linked.removeFirst().value);
        System.out.println(linked.removeFirst());


        // linked.getHead();
        // linked.getTail();
        // linked.getLength();

        // linked.append(2);
        // linked.append(3);
        // linked.printList();
        // System.out.println(linked.removeLast().value);
        // linked.prepend(2);
        // linked.removeLast();
        // linked.removeLast();
        // linked.prepend(2);
        // linked.printList();
    }
}
