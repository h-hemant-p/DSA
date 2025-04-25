package Linked_list;

public class SingleLinkedList {
    // inner class
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList() {
        this.size = 0;
    }

    // returns the node at the given index
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // returns the first node which contains the value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // inserts the value at the beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // prints the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // inserts the value at the end
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // inserts the value at the given index
    public void insert(int val, int index) {
        if (index > size) {
            System.out.println("Index is too large.");
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // deletes the first node
    public int deleteFirst(){
        int value = head.data;
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
        return value;
    }

    // deletes the last node
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    // deletes the node at the given index
    public int delete(int index){
        if (index==0) {
            return deleteFirst();
        }
        if (index==size-1) {
            return deleteLast();
        }
         Node node = get(index-1);
         int value = node.next.data;
         node.next = node.next.next;
         size--;
         return value;
    }

    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertFirst(40);
        ll.insertLast(99);
        ll.insert(100, 2);
        ll.display();
        System.err.println(ll.deleteFirst());
        ll.display();
        System.err.println(ll.deleteLast());
        ll.display();
    }
}
