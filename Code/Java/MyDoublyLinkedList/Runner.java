package Code.Java.MyDoublyLinkedList;

public class Runner {
  public static void main(String[] args) {

    MyDoublyLinkedList dll = new MyDoublyLinkedList();
    dll.insertAt(0, 1);
    dll.insertAt(1, 2);
    dll.insertAt(2, 2);
    dll.insertAt(3, 2);
    dll.insertAt(4, 3);

    dll.display();
    dll.displayReverse();
//    dll.deleteAt(4);
    dll.uniqueSortedList();
    dll.display();
    dll.displayReverse();
//    dll.findPair(5);

  }
}
