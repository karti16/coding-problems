package Code.Java.MyLinkedList;

public class MyLinkedList {
  Node head;

  public void insert(int data) {
    Node node = new Node(data);

    if (head == null) {
      head = node;
    } else {
      Node n = head;
      while (n.next != null) {
        n = n.next;
      }
      n.next = node;
    }
  }

  public void show() {
    Node n = head;
    String s = "[";
    while (n.next != null) {
      s += (n.data);
      s += ", ";
      n = n.next;
    }
    s += n.data;
    s = s.substring(0, s.length());
    s += "]";
    System.out.println(s);
  }

  public void insertAtStart(int data) {
    Node node = new Node(data);
    node.next = head;
    head = node;
  }

  public void insertAt(int index, int data) {
    Node node = new Node(data);
    node.data = data;

    if (index == 0) {
      insertAtStart(data);
      return;
    }

    Node n = head;

    for (int i = 1; i < index - 1; i++) {
      n = n.next;
    }

    node.next = n.next;
    n.next = node;

  }

  public void deleteAt(int index) {
    Node temp = null;

    Node n = head;

    if (index == 0) {
      head = n.next;
    } else {
      for (int i = 1; i < index; i++) {
        n = n.next;
      }
      temp = n.next;
      n.next = temp.next;
    }

  }

  private class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }
}
