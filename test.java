import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5,6,7};
    int k = 3;
    k = k % arr.length; 
    reverseArr(arr, 0, arr.length - 1);
    reverseArr(arr, 0, k - 1);
    reverseArr(arr, k, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }

  static void reverseArr(int[] arr, int start, int end ){
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}