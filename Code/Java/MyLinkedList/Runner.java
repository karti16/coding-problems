package Code.Java.MyLinkedList;

public class Runner {
  public static void main(String[] args) {

    MyLinkedList list = new MyLinkedList();
    list.insert(12);
    list.insert(20);
    list.insert(40);

    list.show();

    list.insertAtStart(99);

    list.show();

  }
}
