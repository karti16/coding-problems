package Code.Java.BinaryTree;

public class Runner {
  public static void main(String[] args) {
    BST tree = new BST();

    int[] nums = { 4, 3, 7, 412, 778, 43, 24, 88 };
    tree.populate(nums);

    tree.display();
  }
}
