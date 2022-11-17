import java.util.*;

public class Java {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 8, 9, 12, 14, 17 };
        int target = 15;
        System.out.println("ceil: " + ceil(arr, target));
        System.out.println("floor: " + floor(arr, target));
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}