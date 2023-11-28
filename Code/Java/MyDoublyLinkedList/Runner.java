package Code.Java.MyDoublyLinkedList;

public class Runner {
    public static void main(String[] args) {

        MyDoublyLinkedList dll = new MyDoublyLinkedList();
        dll.insertAt(0, 1);
        dll.insertAt(1, 2);
        dll.insertAt(2, 3);
        dll.insertAt(3, 4);
        dll.insertAt(4, 5);
        dll.insertAt(5, 6);
        dll.insertAt(6, 7);
        dll.insertAt(7, 8);



        dll.display();
        dll.reverseKGroupNeetCode(4);
//        dll.reverseKGroupStriver(4);
//        dll.sortUsingMergeSort();
//        dll.displayReverse();
//        dll.reverse();
//        dll.deleteAt(4);
//        dll.uniqueSortedList();
//        dll.display();
//        dll.displayReverse();
//        dll.findPair(5);

    }
}
