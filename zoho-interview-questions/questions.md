## 1. Print words in X shape

```
g           s
 e         k
  e       e
   k     e
    s   g
     f r
      o
     f r
    s   g
   k     e
  e       e
 e         k
g           s
```

```java
public class java{
    public static void main(String[] args){
        String str = "geeksforgeeks";
        int len = str.length();
        for (int i = 0; i < len; i++){
            int j = len - 1 - i;
            for(int k = 0; k < len; k++){
                if(k == i || k == j){
                    System.out.print(str.charAt(k));
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println("");
        }
    }
}
```

---

## 2. Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions

    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number

     And sort the numbers based on the weight and print it as follows

     <10,its_weight>,<36,its weight><89,its weight>

     Should display the numbers based on increasing order.

```java
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class test {
  public static void main(String[] args) {

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter size of array");
    // int size = scanner.nextInt();
    // int arr[] = new int[size];
    // System.out.println("Enter element");
    // for (int i = 0; i < size; i++) {
    // arr[i] = scanner.nextInt();
    // }
    // System.out.println(Arrays.toString(arr));

    int arr[] = new int[] { 10, 36, 54, 89, 12 };
    int sumArr[] = new int[arr.length];
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      int sum = 0;

      double sqrt = (int) Math.sqrt(arr[i]);
      if ((sqrt * sqrt) == arr[i]) {
        sum += 5;
      }
      if (arr[i] % 4 == 0 || arr[i] % 6 == 0) {
        sum += 4;
      }
      if (arr[i] % 2 == 0) {
        sum += 3;
      }
      sumArr[i] = sum;
    }

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length - 1; j++) {
        if (sumArr[i] < sumArr[j]) {
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;

          temp = sumArr[j];
          sumArr[j] = sumArr[i];
          sumArr[i] = temp;
        }
      }

    }

    for (int i = 0; i < arr.length - 1; i++) {
      System.out.print("<" + arr[i] + "," + sumArr[i] + ">, ");
    }

  }

}

```

---

### 3.
