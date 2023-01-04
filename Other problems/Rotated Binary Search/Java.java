public class Java {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
        int target = 6;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, start, end);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[start]) {
            return binarySearch(arr, target, start, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, end);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}