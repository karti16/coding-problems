public class Demo {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.insetAtBeginning(1);
        list1.insetAtBeginning(2);
        list1.insertAtPos(0, 99);
        list1.insertAtPos(0, 67);

        list1.display();

    }
}