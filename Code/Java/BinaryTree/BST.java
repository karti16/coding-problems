package Code.Java.BinaryTree;

public class BST {

  private Node root;

  public BST() {
    this.root = null;
  }

  public int height(Node node) {
    if (node == null) {
      return -1;
    }

    return node.getHeight();
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void display() {
    display(root, "Root Node : ");
  }

  private void display(Node node, String details) {
    if (node == null) {
      return;
    }

    System.out.println(details + node.getValue());
    display(node.left, "Left child of " + node.getValue() + " : ");
    display(node.right, "right child of " + node.getValue() + " : ");

  }

  public void insert(int val) {
    root = insert(root, val);
  }

  private Node insert(Node node, int val) {

    if (node == null) {
      node = new Node(val);
      return node;
    }

    if (val < node.getValue()) {
      node.left = insert(node.left, val);
    } else if (val > node.getValue()) {
      node.right = insert(node.right, val);
    }

    return node;
  }

  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      insert(nums[i]);
    }
  }
}
