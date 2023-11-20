package Code.Java.MyDoublyLinkedList;

public class Runner {
    public static void main(String[] args) {

        MyDoublyLinkedList dll = new MyDoublyLinkedList();
        dll.insertAt(0, 7);
        dll.insertAt(1, 3);
        dll.insertAt(2, 5);
        dll.insertAt(3, 2);
        dll.insertAt(4, 6);
        dll.insertAt(4, 4);
        dll.insertAt(4, 1);
        dll.insertAt(4, 8);

        dll.sortUsingMergeSort();


        dll.display();
//        dll.displayReverse();
//        dll.reverse();
//        dll.deleteAt(4);
//        dll.uniqueSortedList();
//        dll.display();
//        dll.displayReverse();
//        dll.findPair(5);

    }
}
