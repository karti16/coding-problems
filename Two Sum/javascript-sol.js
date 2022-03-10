const twoSum = function (nums, target) {
  // my solution
  // Runtime: 211 ms, faster than 17.92% of JavaScript online submissions for Two Sum.
  // Memory Usage: 42.8 MB, less than 34.28% of JavaScript online submissions for Two Sum.

  const sol = [];
  let diff = 0;
  for (let i = 0; i <= nums.length; i++) {
    diff = target - nums[i];
    if (nums.includes(diff)) {
      console.log("diff : " + diff);
      console.log("index : " + nums.indexOf(diff));
      if (i != nums.indexOf(diff)) {
        sol.push(i, nums.indexOf(diff));
        break;
      }
    }
  }
  return sol;

  // Best solution
  //   Runtime: 92 ms, faster than 75.45% of JavaScript online submissions for Two Sum.
  // Memory Usage: 43.4 MB, less than 18.90% of JavaScript online submissions for Two Sum.

  //   const comp = {};
  //   for (let i = 0; i < nums.length; i++) {
  //     if (comp[nums[i]] >= 0) {
  //       return [comp[nums[i]], i];
  //     }
  //     comp[target - nums[i]] = i;
  //     console.log(comp);
  //   }
};

console.log(twoSum([1, 2, 3, 4], 6));
