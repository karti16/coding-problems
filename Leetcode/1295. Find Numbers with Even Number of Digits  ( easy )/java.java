/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        if (nums.length == 0) {
            return count;
        }

        for (int n : nums) {
            if (isEven(n)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count % 2 == 0;
    }
}
// @lc code=end
