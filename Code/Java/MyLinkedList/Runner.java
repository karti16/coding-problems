package Code.Java.MyLinkedList;

public class Runner {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 43, 2, 56, 4};
        MyLinkedList list = new MyLinkedList(arr);

        list.show();

        Node head = list.getHead();
        Node sortedHead = list.sortList(head);
        list.show(sortedHead);
    }
}
