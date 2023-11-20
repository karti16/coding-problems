public class Test {

  public static void main(String[] args) {
    System.out.println("ddd");
  }
}

class GfG {

  public static Node sortedInsert(Node head, int x) {
    Node newNode = new Node(x);
    if (head == null) return newNode;

    if (x <= head.data) {
      newNode.next = head;
      head.prev = newNode;
      return newNode;
    }

    Node curr = head;

    while (curr.next != null && curr.next.data < x) {
      curr = curr.next;
    }

    newNode.next = curr.next;

    if (curr.next != null) {
      curr.next.prev = newNode;
    }

    curr.next = newNode;
    newNode.prev = curr;

    return head;
  }
}
