package Linked_list;

public class DoublyLinkedList {
    // inner class
    private class Node {
        private Node prev;
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;

    // returns the node at the given index
    // public Node get(int index){
    //     Node node = head;
    //     for (int i = 0; i < index; i++) {
    //         node = node.next;
    //     }
    //     return node;
    // }

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
        node.prev = null;
        if (head!=null) {
            head.prev = node;
        }
        head = node;
    }

    // prints the linked list
    public void display() {
        Node temp = head;
        Node last = null;
        System.out.println("--------Print Forward-----------");
        System.out.print("Start ⇄ ");
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("--------Print Reverse-----------");
        System.out.print("End ⇄ ");
        while (last != null) {
            System.out.print(last.data + " ⇄ ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    // inserts the value at the end
    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    // inserts after the given value
    public void insert(int after, int val) {
        Node p = find(after);
        if(p ==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next!=null){
            node.next.prev = node;
        }
    }

    

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.insertFirst(40);
        dll.insertLast(99);
        dll.insert(30, 65);
        dll.display();
        // System.err.println(dll.deleteFirst());
        // dll.display();
        // System.err.println(dll.deleteLast());
        // dll.display();
    }
}
