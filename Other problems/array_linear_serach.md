```java
public class Java {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 67 };
        int target = 4;
        System.out.println(linearSearch(nums, target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
```
