## 30. Merge Sort

```java
import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 4, 3, 5, 7, 2, 9 };
    int n = arr.length;
    mergeSort(arr, 0, n - 1);
    for (int i : arr) {
      System.out.print(i + " ");
    }

  }

  static void mergeSort(int[] arr, int start, int end) {
    if (start >= end)
      return;
    int mid = start + (end - start) / 2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);
    merge(arr, start, mid, end);
  }

  static void merge(int[] arr, int start, int mid, int end) {

    ArrayList<Integer> temp = new ArrayList<>();

    int left = start;
    int right = mid + 1;

    while (left <= mid && right <= end) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= end) {
      temp.add(arr[right]);
      right++;
    }

    for (int i = start; i < end; i++) {
      arr[i] = temp.get(i - start);
    }

  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 31. [Subarray with given sum](https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category[]=Arrays&sortBy=submissions)

```Find a continuous sub-array that adds to a given number S
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
```

%

```java
import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 7, 5 };
    int num = 12;
    int sum = arr[0];
    int left = 0;
    int right = 0;
    ArrayList<Integer> res = new ArrayList<>();
    if(num == 0){
      res.add(-1);
      return res;
    }
    while (right < arr.length) {
      if (sum == num) {
        res.add(left);
        res.add(right);
        break;
      }
      if (sum < num) {
        if(right < arr.length){
          sum += arr[++right];
        }
        continue;
      }
      if (sum > num) {
        sum -= arr[left++];
        continue;
      }
    }

    System.out.println(res);

  }

}

```

**[⬆ Back to Top](#list-of-problems)**

## 32. Recursive Bubble Sort

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 6, 9, 12, 7, 5 };
    recursiveBubbleSort(arr, arr.length);
    System.out.println(Arrays.toString(arr));

  }

  static void recursiveBubbleSort(int[] arr, int i) {
    if (i == 0) {
      return;
    }
    for (int j = 0; j < i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        int temp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = temp;
      }
    }

    recursiveBubbleSort(arr, --i);
  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 33. Recursive Insertion Sort

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 6, 9, 12, 7, 5 };
    recursiveInsertionSort(arr, 0);
    System.out.println(Arrays.toString(arr));

  }

  static void recursiveInsertionSort(int[] arr, int i) {
    if (i >= arr.length) {
      return;
    }
    for (int j = i; j > 0; j--) {
      if (arr[j] < arr[j - 1]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
      }
    }

    recursiveInsertionSort(arr, ++i);
  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 34. Quick Sort

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 6, 9, 12, 7, 5 };
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));

  }

  static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pIndex = partition(arr, low, high);
      quickSort(arr, low, pIndex - 1);
      quickSort(arr, pIndex + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }

      while (arr[j] > pivot && j >= low + 1) {
        j--;
      }

      if (i < j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }

    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }

}
```

**[⬆ Back to Top](#list-of-problems)**
