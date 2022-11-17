/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        int diff = target - num;
        if (prevMap.containsKey(diff)) {
            return new int[] { prevMap.get(diff), i };
        } else {
            prevMap.put(num, i);
        }
        }
        return new int[] {};
    }
}
// @lc code=end

