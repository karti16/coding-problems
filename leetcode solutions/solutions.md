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

## 18. [Maximum Number of Words Found in Sentences - (2114)](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences)

```java
//JAVA
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = findNumberOfWords(sentences[0]);
        for(int i = 1; i< sentences.length; i++){
            int len = findNumberOfWords(sentences[i]);
            if(len > max){
                max = len;
            }
        }
        return max;
    }

    int findNumberOfWords(String sen){
        char[] toArr = sen.toCharArray();
        if(toArr.length == 0) return 0;
        int count = 1;
        for(int i = 0; i < toArr.length - 1; i++){
            if(toArr[i] == ' '){
                count++;
            }
        }

        return count;
    }
}

//////////

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0; i<sentences.length; i++) {
            max = Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;
    }
}
```

```javascript
//javascript
/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function (sentences) {
  let max = sentences[0].split(" ").length;
  console.log(max);
  for (let i = 1; i < sentences.length; i++) {
    let tempLen = sentences[i].split(" ").length;
    if (tempLen > max) {
      max = tempLen;
    }
  }

  return max;
};
```

---

## 19. [Length of Last Word - (58)](https://leetcode.com/problems/length-of-last-word/submissions)

```java
//JAVA
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        int count = 1;
        for(int i = s.length() - 1; i > 0; i--){
            if(s.charAt(i) != ' ' && s.charAt(i - 1) == ' '){
                return count;
            }
            if(s.charAt(i) != ' '){
                count ++;
            }
        }
        return count;
    }
}
```

```javascript
//javascript
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function (s) {
  if (s.length === 0) return 0;
  let lastWord = s.trim().split(" ");
  return lastWord.at(-1).length;
};
```

---

## 17. [Reverse Integer - (7)](https://leetcode.com/problems/reverse-integer)

```java
//JAVA
class Solution {
    public int reverse(int x) {
        boolean flag = true;
        if(x < 0) flag = false;
        long num = 0;
        x = Math.abs(x);
        while(x>0){
            num = num * 10;
            int r = x % 10;
            num = num + r;
            x = x / 10;
        }

        if(num > Integer.MAX_VALUE) return 0;

        if(flag) return (int)num;
        else return (int)num * -1;
    }
}

```

```javascript
//javascript

/**
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
  let flag = true;
  if (x < 0) flag = false;
  let num = 0;
  x = Math.abs(x);
  while (x > 0) {
    num = num * 10;
    let r = x % 10;
    num = num + r;
    x = Math.floor(x / 10);
  }
  if (num > Math.pow(2, 31)) return 0;

  return flag ? num : num * -1;
};
```

---

## \*\*. [ - ()](https://leetcode.com/problems/)

```java
//JAVA

```

```javascript
//javascript
```

---
