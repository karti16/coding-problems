public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    public void insetAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int pos, int val) {

        if (pos == 0) {
            insetAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 1; i < pos; i++) {
            if (temp.next == null) {
                throw new IndexOutOfBoundsException("Invalid position");
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteAtPos(int pos) {

        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (pos == 0) {
            head = head.next;
        }

        Node temp = head;
        Node prev = null;
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }
}