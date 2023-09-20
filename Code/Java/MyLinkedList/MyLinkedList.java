package Code.Java.MyLinkedList;

public class MyLinkedList {
  Node head;

  public void insert(int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

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
    s = s.substring(0, s.length() - 2);
    s += "]";
    System.out.println(s);
  }

  public void insertAtStart(int data) {
    Node node = new Node();
    node.data = data;
    node.next = head;
    head = node;
  }
}
