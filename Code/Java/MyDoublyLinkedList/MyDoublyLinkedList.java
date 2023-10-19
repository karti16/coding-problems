package Code.Java.MyDoublyLinkedList;

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

    for (int i = 1; i <= position; i++) {
      prev = n;
      n = n.next;
      if (n == null) {
        throw new IndexOutOfBoundsException("Invalid position");
      }
    }

    System.out.println(n.data);
    prev.next = n.next;
    if (n.next == null) {
      tail = prev;
    } else {
      n.next.prev = prev;
    }

  }

  private class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
    }
  }
}
