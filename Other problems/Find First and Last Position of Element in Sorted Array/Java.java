import java.util.*;

public class Java {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 5, 5, 6, 7 };
        int target = 5;

        int[] result = findFirstAndLast(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] findFirstAndLast(int[] nums, int target) {
        int[] ans = { -1, -1 };

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;

    }

    static int search(int[] nums, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}