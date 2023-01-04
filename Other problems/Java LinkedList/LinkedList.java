import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    Node head;

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    public void insetAtBeginning(T val) {
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

    public void insertAtPos(int pos, T val) {

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
            return;
        }

        Node temp = head;
        Node prev = null;
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;

            public boolean hasNext() {
                return temp != null;
            }

            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }
}