## 35. Find Largest ELement in Array

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 9, 0, 1, 2 };
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }

    System.out.println(max);

  }

}
```

**[⬆ Back to Top](#list-of-problems)**
## 36. Second Largest Element in an Array without sorting

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 9, 0, 7, 1, 2 };
    int max = arr[0];
    int max_2 = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max_2 = max;
        max = arr[i];
      } else if (arr[i] < max && arr[i] != max_2) {
        max_2 = arr[i];
      }
    }

    System.out.println(max + ", " + max_2);

  }

}

```

**[⬆ Back to Top](#list-of-problems)**
## 37. Check if array is sorted or not
[Question link](https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 9, 0, 1, 2 };
    for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i] > arr[i + 1]) {
            System.out.println("Not sorted");
          }
        }

    System.out.println("Sorted");

  }

}

```

**[⬆ Back to Top](#list-of-problems)**
## 38. Check if Array Is Sorted and Rotated

[Question link](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/)

[Video Solution Link](https://www.youtube.com/watch?v=t1GLDWqWVQk&t=310s)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 5, 1, 2 };
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[(i + 1) % arr.length]) {
        count++;
      }
    }
    if (count <= 1) {
      System.out.println("Array is sorted and rotated");
    } else {
      System.out.println("Array is not sorted / rotated");
    }
  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 39. Remove Duplicates from Sorted Array

[Question link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)

[Question link](https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicate-elements-from-sorted-array)

[Video Solution Link](https://youtu.be/37E9ckMDdTk?t=1890)

%

```java
// TC -> O(n)
// SC -> O(1)
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1,1,2,2,3,4,4 };
    int i = 0;
    int j = 1;
    while(j < arr.length){
      if(arr[i] != arr[j]){
        arr[i+1] = arr[j];
        i++;
      }
      j++;
    }

    System.out.println(Arrays.toString(arr));
  }
}
```

**[⬆ Back to Top](#list-of-problems)**
## 10. Rotate Array by k positions

[Question link](https://leetcode.com/problems/rotate-array/)

[Video Solution Link](https://www.youtube.com/watch?v=BHr381Guz3Y)

%

```java
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

```

**[⬆ Back to Top](#list-of-problems)**
