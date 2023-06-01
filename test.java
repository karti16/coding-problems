public class test {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 3 };

    int count = 0;
    int ele = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (count == 0) {
        count = 1;
        ele = arr[i];
      } else if (arr[i] == ele) {
        count++;
      } else {
        count--;
      }
    }

    int count_1 = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == ele)
        count_1++;
    }

    System.out.println(count_1 > arr.length / 2 ? ele : -1);

  }
}
