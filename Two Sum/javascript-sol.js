const twoSum = function (nums, target) {
  // my solution
  // Runtime: 211 ms, faster than 17.92% of JavaScript online submissions for Two Sum.
  // Memory Usage: 42.8 MB, less than 34.28% of JavaScript online submissions for Two Sum.

  // declare solution array
  // loop through the nums array
  // storing difference of target and all value of nums array to diff variable
  // check diff in present in nums array or not
  // make sure it doesnt add the same element twice
  // adding interation (i) and index of diff in nums array to the solution array
  // and returning the sol array
  const sol = [];

  for (let i = 0; i <= nums.length; i++) {
    let diff = target - nums[i];
    if (nums.includes(diff)) {
      if (i != nums.indexOf(diff)) {
        sol.push(i, nums.indexOf(diff));
        break;
      }
    }
  }
  return sol;

  // Best solution
  // Runtime: 92 ms, faster than 75.45% of JavaScript online submissions for Two Sum.
  // Memory Usage: 43.4 MB, less than 18.90% of JavaScript online submissions for Two Sum.
  // declare comp dict
  // loop through the nums array
  // check dict has key of (nums value)
  // If not present add "key of target minus value of nums" with "value of iteration (i)"
  //
  //   const comp = {};
  //   for (let i = 0; i < nums.length; i++) {
  //     if (comp[nums[i]] >= 0) {
  //       return [comp[nums[i]], i];
  //     }
  //     comp[target - nums[i]] = i;
  //   }
};

console.log(twoSum([1, 2, 3, 4], 6));
