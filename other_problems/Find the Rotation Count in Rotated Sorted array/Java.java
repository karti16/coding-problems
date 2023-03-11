public class Java {
    public static void main(String[] args) {
        int[] arr = { 15, 18, 19, 2, 3, 6, 12 };
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                ans = mid + 1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                ans = mid;
            }

            if (arr[start] < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
    
}