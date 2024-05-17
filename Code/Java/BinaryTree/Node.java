package Code.Java.BinaryTree;

public class Node {
  private int val;
  private int height;
  public Node left;
  public Node right;

  public Node(int val) {
    this.val = val;
  }

  public int getValue() {
    return this.val;
  }

  public int getHeight() {
    return this.height;
  }
}
