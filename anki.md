## 41. Quick Left Rotation

[Question link](https://practice.geeksforgeeks.org/problems/quick-left-rotation3806/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-left-rotation)

[Video Solution Link](https://www.youtube.com/watch?v=BHr381Guz3Y)

%

```java
// TC -> O(2n)
// SC -> O(1)
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5,6,7};
    int k = 3;
    k = arr.length - (k % arr.length); 

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
## 42. Move all zeroes to end of array

[Question link](https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=move-all-zeroes-to-end-of-array)

[Question link](https://leetcode.com/problems/move-zeroes/)

[Video Solution Link](https://www.youtube.com/watch?v=aayNRwUN3Do)



%

```java
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = {1, 0, 9, 3, 5, 0, 0, 4};
    
    int left = 0;
 

    for ( int right = 0; right < arr.length; right++){
      if(arr[right] != 0){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 43. Union of Two Sorted Arrays

[Question link](https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays)

[Video Solution Link](https://youtu.be/wvcQg43_V8U?t=2588)

%

```java
// TC -> O(n1 + n2)
// SC -> O(n1 + n2)
import java.util.ArrayList;
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 1, 2, 3, 7 };
    int n1 = arr1.length;
    int n2 = arr2.length;

    int i = 0;
    int j = 0;

    ArrayList<Integer> result = new ArrayList<Integer>();

    while (i < n1 && j < n2) {
      if (arr1[i] <= arr2[j]) {
        if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
          result.add(arr1[i]);
        }
        i++;
      } else {
        if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
          result.add(arr2[j]);
        }
        j++;
      }
    }

    while (i < n1) {
      if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
        result.add(arr1[i]);
      }
      i++;
    }

    while (j < n2) {
      if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
        result.add(arr2[j]);
      }
      j++;
    }

    System.out.println(result);

  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 44. Find common numbers in two sorted arrays

[Question link]()

[Video Solution Link](https://youtu.be/wvcQg43_V8U?t=3564)

%

```java

import java.util.ArrayList;
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 3, 4, 5 };
    int[] arr2 = { 1, 2, 3, 7 };
    int n1 = arr1.length;
    int n2 = arr2.length;

    int i = 0;
    int j = 0;

    ArrayList<Integer> result = new ArrayList<Integer>();

    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr2[j] < arr1[i]) {
        j++;
      } else {
        
        result.add(arr1[i]);
        i++;
        j++;
      }
    }

    System.out.println(result);

  }
}
```

**[⬆ Back to Top](#list-of-problems)**
## 45. Find Missing Number in array

[Question link](https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number)

[Video Solution Link](https://youtu.be/bYWLJb3vCWY?t=72)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 3 };
    int n = 4;
    int[] res = new int[n + 1];

    for (int i = 0; i < arr.length; i++) {
      res[arr[i]] = 1;
    }

    for (int i = 1; i < res.length; i++) {
      if (res[i] == 0) {
        System.out.println(i);
        break;
      }
    }

  }
}

// -----------

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 3 };
    int n = 4;
    int xor1 = 0;
    int xor2 = 0;

    for (int i = 1; i <= n; i++) {
      xor1 ^= i;
    }

    for (int i = 0; i < arr.length; i++) {
      xor2 ^= arr[i];
    }

    System.out.println(xor1 ^ xor2);

  }
}

```

**[⬆ Back to Top](#list-of-problems)**
## 46. Find Max Consecutive '1's

[Question link](https://leetcode.com/problems/max-consecutive-ones/description/)

[Video Solution Link](https://youtu.be/bYWLJb3vCWY?t=1132)

%

```java

// TC -> O(n)

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
    int n = arr.length;

    int max = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        count++;
        max = Math.max(count, max);
      }
      if (arr[i] != 1) {
        count = 0;
      }
    }

    System.out.println(max);

  }
}

```

**[⬆ Back to Top](#list-of-problems)**