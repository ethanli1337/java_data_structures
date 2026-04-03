package datastructures;

public class LinkedList { 
    private Node head;
    private Node tail;
    private int length;
    
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value=value;

    }
}
    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }   

    public void append(int value) {

    }

    public void prepend(int value) {

    }

    public boolean insert(int index, int value) {

        return true;
    }
}