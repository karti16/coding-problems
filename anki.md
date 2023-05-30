## 55. Maximum Subarray

[Question link](https://leetcode.com/problems/maximum-subarray/description/)

[Video Solution Link](https://www.youtube.com/watch?v=5WZl3MMT0Eg)

%

```java
public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, -2, 5 };

    int max = Integer.MIN_VALUE;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {

      if (sum < 0) {
        sum = 0;
      }
      sum += arr[i];
      max = Math.max(max, sum);
    }

    System.out.println(sum);

  }
}

```
