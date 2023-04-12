## 24. Return array of fibonacci number till N

```java
import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int n = 10;
    ArrayList<Integer> list = new ArrayList<>();
    fibonacci(list, 1, 1, n);
    System.out.println(list);
  }

  static void fibonacci(ArrayList<Integer> list, int first, int second, int n) {
    if (n == 0) {
      return;
    } else {
      list.add(first);
      fibonacci(list, second, (first + second), n - 1);

    }
  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 25. Reverse array in groups

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int group = 3;
    int len = arr.length - 1;

    for (int i = 0; i < len; i += group) {

      int start = i;
      int end = Math.min(i + group - 1, len);

      while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}


```

**[⬆ Back to Top](#list-of-problems)**

## 26. Top K Frequent Elements in Array

```java
/* count the frequency and store it in hashmap.
 * Create array of arrays for size nums length
 * Store the nums by their frequency in List
 * like 5 , 2, occurred 3 times then store 5,3 in the 3rd index of the list
 * Iterate list from hight to lowest and print the numbers
 *
 * link -> https://www.youtube.com/watch?v=YPTqKIgVk-k
 * link -> https://www.geeksforgeeks.org/find-k-numbers-occurrences-given-array/
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class test {
  public static void main(String[] args) {
    int[] a = { 1, 1, 1, 4, 5, 5, 5, 2, 2, 2, 3 };
    int k = 2;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < a.length; i++) {
      map.put(a[i], map.getOrDefault(a[i], 0) + 1);
    }

    List<List<Integer>> freq = new ArrayList<>();

    for (int i = 0; i < a.length + 1; i++) {
      freq.add(new ArrayList<>());
    }

    for (int key : map.keySet()) {
      freq.get(map.get(key)).add(key);
    }

    int[] res = new int[2];
    int count = 0;
    for (int i = freq.size() - 1; i >= 0; i--) {

      if (freq.get(i).size() > 1) {
        Collections.sort(freq.get(i), Collections.reverseOrder());
      }

      for (int ele : freq.get(i)) {
        if (count >= k)
          break;
        res[count++] = ele;
      }
    }
    System.out.println(Arrays.toString(res));
    System.out.println(freq);
    System.out.println(map);

  }
}


```

**[⬆ Back to Top](#list-of-problems)**

## 27. Selection Sort

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 12, 5, 34, 67, 9, 55 };
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }

      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }

    System.out.println(Arrays.toString(arr));

  }
}

```

**[⬆ Back to Top](#list-of-problems)**
