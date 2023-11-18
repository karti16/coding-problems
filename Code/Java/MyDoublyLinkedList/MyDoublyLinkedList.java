package Code.Java.MyDoublyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("end");
        System.out.println();
    }

    public void displayReverse() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node n = tail;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.prev;
        }
        System.out.println("start");
        System.out.println();
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }

        head = newNode;
    }

    public void insertAt(int position, int data) {

        if (position == 0) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node n = head;
        for (int i = 1; i < position; i++) {
            n = n.next;
            if (n == null) {
                throw new IndexOutOfBoundsException("Invalid position");
            }
        }

        if (n == tail) {
            insetAtEnd(data);
            return;
        }

        newNode.next = n.next;
        newNode.prev = n;
        n.next.prev = newNode;
        n.next = newNode;
    }

    public void insetAtEnd(int data) {
        if (head == null) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteAt(int position) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (position == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            return;
        }
        Node n = head;
        Node prev = null;
        try {
            for (int i = 1; i <= position; i++) {
                prev = n;
                n = n.next;
                if (n == null) {
                    throw new IndexOutOfBoundsException("Invalid position");
                }
            }
            System.out.println(n.data);
            assert prev != null;
            prev.next = n.next;
            if (n.next == null) {
                tail = prev;
            } else {
                n.next.prev = prev;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cant delete. Position out of range");
        }


    }

    public void findPair(int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Node n = head;

        while (n != null) {
            if (map.containsKey(k - n.data)) {
                res.add(new ArrayList<>(Arrays.asList(k - n.data, n.data)));
            }
            int count = map.getOrDefault(n.data, 0);
            map.put(n.data, count + 1);
            n = n.next;
        }

        System.out.println(res);
    }

    public void uniqueSortedList() {
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (prev.data == curr.data) {
                prev.next = curr.next;
                if (curr.next != null) {
                    curr.next.prev = prev;
                }
            } else if (curr.next == null && curr.data == prev.data) {
                prev.next = null;
            } else if (curr.data != prev.data) {
                prev = prev.next;
            }
            curr = curr.next;
        }
    }
}
