/*
 * @lc app=leetcode id=217 lang=c
 *
 * [217] Contains Duplicate
 */

// @lc code=start
int cmpF(int *num1, int *num2){
    return *num1-*num2;
}

bool containsDuplicate(int* nums, int numsSize){
qsort(nums, numsSize, sizeof(int), cmpF);
    for (int i=0; i<numsSize-1; i++)
    {
        if (nums[i]==nums[i+1]) return true;
    }
    return false;
}
// @lc code=end

