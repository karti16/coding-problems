
public class test {
  public static void main(String[] args) {
    int n1 = 52;
    int n2 = 10;

    while (n1 > 0 && n2 > 0) {
      if (n1 > n2) {
        n1 = n1 % n2;
      } else {
        n2 = n2 % n1;
      }
    }
    System.out.println("GCD / HCF : " + Math.max(n1, n2));

  }
}
