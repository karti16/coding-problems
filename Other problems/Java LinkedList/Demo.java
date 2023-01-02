public class Demo {
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.insetAtBeginning(1);
        list1.insetAtBeginning(2);
        list1.insertAtPos(0, 99);
        list1.insertAtPos(0, 67);

        list1.display();
        System.out.println("");
        list1.deleteAtPos(0);

        list1.display();
    }
}