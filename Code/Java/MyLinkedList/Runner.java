package Code.Java.MyLinkedList;

public class Runner {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        MyLinkedList list = new MyLinkedList(arr);
        list.show();
//        list.show(list.reverse());

        Node h = list.addOneToNode();
        list.show(h);


    }
}
