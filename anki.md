## 47. Maximize Number of 1's

[Question link](https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=maximize-number-of-1s)

[Video Solution Link](https://www.youtube.com/watch?v=hzueK-imcXg&t=920s&pp=ygUWbWF4aW1pemUgbnVtYmVyIG9mIDEncw%3D%3D)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
    int max_flips = 2;
    int ans = 0;
    int flips = 0;
    int j = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        flips++;
      }

      while (flips > max_flips) {
        if (arr[j] == 0) {
          flips--;
        }
        j++;
      }

      ans = Math.max(ans, i - j + 1);
    }

    System.out.println(ans);

  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 48. Find the element that appears once

[Question link](https://practice.geeksforgeeks.org/problems/element-appearing-once2552/0?company[]=Qualcomm&company[]=Qualcomm&difficulty[]=1&page=1&query=company[]Qualcommdifficulty[]1page1company[]Qualcomm&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=element-appearing-once)

[Video Solution Link](https://youtu.be/bYWLJb3vCWY?t=1377)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 5, 5 };
    int xor = 0;
    for (int i : arr)
      xor ^= i;

    System.out.println(xor);

  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 49. Longest Sub-Array with Sum K (-ve, 0, +ve numbers)

[Question link](https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k)

[Video Solution Link](https://www.youtube.com/watch?v=frf7qxiN2qU)

%

```java
import java.util.HashMap;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, -1, 1, 1 };
    int k = 3;
    int sum = 0;
    int maxLen = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == k) {
        maxLen = Math.max(maxLen, i + 1);
      }

      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }

      int rem = sum - k;

      if (map.containsKey(rem)) {
        if (maxLen < (i - map.get(rem))) {
          maxLen = i - map.get(rem);
        }
      }
    }

    System.out.println(maxLen);
  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 50. Longest Sub-Array with Sum K (0, +ve numbers)

[Question link]()

[Video Solution Link](https://youtu.be/frf7qxiN2qU?t=1740)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1, 0, 1, 1 };
    int k = 3;
    int sum = arr[0];
    int maxLen = 0;
    int left = 0, right = 0;

    while (right < arr.length) {
      while (left <= right && sum > k) {
        sum -= arr[left++];
      }

      if (sum == k) {
        maxLen = Math.max(maxLen, right - left + 1);
      }

      right++;
      if (right < arr.length) {
        sum += arr[right];
      }

    }

    System.out.println(maxLen);
  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 51. Find all pairs with a given sum

[Question link](https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-pairs-whose-sum-is-x)

[Video Solution Link](https://www.youtube.com/watch?v=QsadUO5JYGY)

%

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class pair {
  int first, second;

  public pair(int first, int second) {
    this.first = first;
    this.second = second;
  }
}

public class test {
  public static void main(String[] args) {
    int[] A = { 1, 2, 4, 5, 7 };
    int[] B = { 5, 6, 3, 4, 8 };

    int target = 9;
    ArrayList<pair> res = new ArrayList<>();
    Set<Integer> set = new HashSet<Integer>();

    for (int a : A) {
      set.add(a);
    }

    Arrays.sort(A);

    for (int b : B) {
      if (set.contains(target - b)) {
        pair p = new pair(target - b, b);
        res.add(p);
      }
    }

    for (pair a : res) {
      System.out.println("[ " + a.first + ", " + a.second + " ]");
    }
  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 52. Two Sum

[Question link](https://leetcode.com/problems/two-sum/)

[Video Solution Link]()

%

```java
import java.util.Arrays;
import java.util.HashMap;

public class test {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 4, 5, 7 };
    int target = 12;
    int[] ans = { -1, -1 };
    HashMap<Integer, Integer> list = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int bal = target - nums[i];
      if (list.containsKey(bal)) {
        ans[0] = list.get(bal);
        ans[1] = i;
      } else {
        list.put(nums[i], i);
      }
    }
    System.out.println(Arrays.toString(ans));
  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 53. Sort Colors / Sort an array of 0s, 1s and 2s

[Question link](https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sort-an-array-of-0s-1s-and-2s)

[Question link](https://leetcode.com/problems/sort-colors/description/)

[Video Solution Link](https://youtu.be/tp8JIuCXBaU)

%

```java
// TC -> O(N)
// SC -> O(1)

import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 0, 2, 2, 1, 1, 0 };
    int low = 0, mid = 0, high = arr.length - 1;
    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(arr, low, mid);
        low++;
        mid++;

      } else if (arr[mid] == 1) {
        mid++;
      } else {
        swap(arr, mid, high);
        high--;
      }
    }

    System.out.println(Arrays.toString(arr));
  }

  static void swap(int[] arr, int num1, int num2) {
    int temp = arr[num1];
    arr[num1] = arr[num2];
    arr[num2] = temp;
  }
}

```

**[⬆ Back to Top](#list-of-problems)**

## 54. Majority Element

[Question link](https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=majority-element)

[Question link](https://leetcode.com/problems/majority-element/description/)

[Video Solution Link](https://www.youtube.com/watch?v=nP_ns3uSh80&list=PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz&index=22)

%

```java
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
```

**[⬆ Back to Top](#list-of-problems)**
