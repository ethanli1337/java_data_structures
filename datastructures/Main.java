package datastructures;

public class Main {
    
    public static void main(String[] args) {
        LinkedList linked = new LinkedList(0);
        linked.append(1);
        linked.append(2);
        linked.append(3);

        System.out.println(linked.get(2).value + "\n");

        linked.printList();


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
