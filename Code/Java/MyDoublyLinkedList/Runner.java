package Code.Java.MyDoublyLinkedList;

public class Runner {
  public static void main(String[] args) {

    MyDoublyLinkedList list = new MyDoublyLinkedList(); // 0 based index
    list.insertAtStart(10);
    list.insertAtStart(20);
    list.insertAtStart(30);
    list.show();
  }
}
