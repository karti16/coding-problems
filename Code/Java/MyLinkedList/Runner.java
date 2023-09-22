package Code.Java.MyLinkedList;

public class Runner {
  public static void main(String[] args) {

    MyLinkedList list = new MyLinkedList(); // 0 based index
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);

    list.insertAt(0, 99);
    list.show();

    list.deleteAt(0);
    list.show();
  }
}
