package Code.Java.MyDoublyLinkedList;

public class Runner {
  public static void main(String[] args) {

    MyDoublyLinkedList dll = new MyDoublyLinkedList();
    dll.insertAt(0, 1);
    dll.insertAt(1, 2);
    dll.insertAt(2, 3);
    dll.insertAt(3, 4);

    dll.display();
    dll.displayReverse();

    dll.deleteAt(4);

    dll.display();
    dll.displayReverse();

  }
}
