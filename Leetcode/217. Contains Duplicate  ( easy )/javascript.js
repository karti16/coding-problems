/*
 * @lc app=leetcode id=217 lang=javascript
 *
 * [217] Contains Duplicate
 */

// @lc code=start
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let temp = new Set();

    for(let num of nums){
        if(temp.has(num)){
            return true;
        }else{
            temp.add(num)
        }
    }

    return false;
};
// @lc code=end

