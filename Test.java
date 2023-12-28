import java.util.Arrays;
import java.util.Stack;

public class Test {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

    st.push(3);
    st.push(2);
    st.push(14);
    st.push(48);

    System.out.println(Arrays.toString(st.toArray()));

    sort(st);

    System.out.println(Arrays.toString(st.toArray()));
  }

  public static void sort(Stack<Integer> st) {
    if (st.isEmpty()) {
      return;
    }

    int temp = st.pop();
    sort(st);

    insertAtCorrectPosition(st, temp);
  }

  public static void insertAtCorrectPosition(Stack<Integer> st, int temp) {
    if (st.isEmpty()) {
      st.push(temp);
      return;
    }

    int elem = st.pop();
    insertAtCorrectPosition(st, temp);

    st.push(elem);
  }
}