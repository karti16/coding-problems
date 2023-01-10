## 16. [Remove Element - (27)](https://leetcode.com/problems/remove-element/)

```java
//JAVA

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(val != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
```

```javascript
//javascript

/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function (nums, val) {
  if (nums.length === 0) return 0;
  let k = 0;
  for (let [i, num] of nums.entries()) {
    if (val !== num) {
      nums[k] = nums[i];
      k++;
    }
  }
  return k;
};
```

---

## 17. [Running Sum of 1d Array - (1480)](https://leetcode.com/problems/running-sum-of-1d-array/)

```java
//JAVA

class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length == 1) return nums;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i] = prev + nums[i];
            prev = nums[i];
        }
        return nums;
    }
}
```

```javascript
//javascript

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function (nums) {
  if (nums.length === 1) return nums;
  let prev = nums[0];
  for (let i = 1; i < nums.length; i++) {
    nums[i] = prev + nums[i];
    prev = nums[i];
  }
  return nums;
};
```

---
