/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> temp = new HashSet<Integer>();
        for(int num : nums){
            if(temp.contains(num)){
                return true;
            }else{
                temp.add(num);
            }
        }
        return false;
    }
}
// @lc code=end

