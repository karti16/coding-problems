## 1.Fibonacci using dp and memoization

```javascript 
function fib(n, mem = {}) {
  if (mem[n]) return mem[n];
  if (n <= 2) return 1;
  mem[n] = fib(n - 2, mem) + fib(n - 1, mem);
  return mem[n];
}


console.time("fib");
console.log(fib(45));
console.timeEnd("fib");

function fib_dp(n) {
  let dp = [0, 1];
  for (let i = 2; i <= n; i++) {
    dp[i] = dp[i - 2] + dp[i - 1];
  }

  return dp[n];
}
console.time("fib_dp");
console.log(fib_dp(45));
console.timeEnd("fib_dp");

// 1134903170
// fib: 4.151ms
// 1134903170
// fib_dp: 0.147ms
```

## 2. Grid traveler

```javascript
function gridTraveler(m, n, mem = {}) {
  const key = m + '_' + n;

  if (mem[key]) return mem[key];

  if (m === 1 || n === 1) return 1;

  mem[key] = gridTraveler(m - 1, n, mem) + gridTraveler(m, n - 1, mem);

  return mem[key];

}


log(gridTraveler(1, 1)); // 1
log(gridTraveler(2, 3)); // 3
log(gridTraveler(3, 2)); // 3
log(gridTraveler(3, 3)); // 6
log(gridTraveler(18, 18)); // 2333606220
```

## 3. Can Sum

```javascript
function canSum(targetSum, numbers, memo = {}) {
  if (targetSum in memo) return memo[targetSum];
  if (targetSum === 0) return true;
  if (targetSum < 0) return false;


  for (let num of numbers) {
    const remainders = targetSum - num;
    if (canSum(remainders, numbers, memo) === true) {
      memo[targetSum] = true;
      return true;
    }
  }

  memo[targetSum] = false;
  return false;
}


log(canSum(7, [2, 3]));
log(canSum(7, [5, 3, 4, 7]));
log(canSum(7, [2, 4]));
log(canSum(8, [2, 3, 5]));
log(canSum(300, [7, 14]));
```

## 4. How Sum

```javascript
function howSum(targetSum, numbers, memo = {}) {
  if (targetSum in memo) return memo[targetSum];
  if (targetSum === 0) return [];
  if (targetSum < 0) return null;


  for (let num of numbers) {
    const remainders = targetSum - num;
    const remainderResult = howSum(remainders, numbers, memo);
    if (remainderResult !== null) {
      memo[targetSum] = [...remainderResult, num];
      return memo[targetSum];
    }
  }
  memo[targetSum] = null;
  return memo[targetSum];
}


log(howSum(7, [2, 3]));
log(howSum(7, [5, 3, 4, 7]));
log(howSum(7, [2, 4]));
log(howSum(8, [2, 3, 5]));
log(howSum(300, [7, 14]));
```

## 5. Best Sum

```javascript
function bestSum(targetSum, numbers, memo = {}) {
  if (targetSum in memo) return memo[targetSum];
  if (targetSum === 0) return [];
  if (targetSum < 0) return null;

  let shortestCombination = null;


  for (let num of numbers) {
    const remainders = targetSum - num;
    const remainderCombination = bestSum(remainders, numbers, memo);
    if (remainderCombination !== null) {
      const combination = [...remainderCombination, num];
      if (shortestCombination === null || combination.length < shortestCombination.length)
        shortestCombination = combination;
    }
  }
  memo[targetSum] = shortestCombination;
  return memo[targetSum];
}


log(bestSum(7, [2, 3]));
log(bestSum(7, [5, 3, 4, 7]));
log(bestSum(7, [2, 4]));
log(bestSum(8, [2, 3, 5]));
log(bestSum(100, [1, 2, 5, 25]));
```

## 6. Can Construct

```javascript
function canConstruct(target, wordBank, memo = {}) {
  if (target in memo) return memo[target];
  if (target === "") return true;

  for (let word of wordBank) {
    if (target.indexOf(word) === 0) {
      const suffix = target.slice(word.length);
      if (canConstruct(suffix, wordBank, memo) === true) {
        memo[target] = true;
        return memo[target];
      }
    }
  }

  memo[target] = false;
  return memo[target];
}


log(canConstruct("abcdef", ['ab', 'abc', 'cd', 'def', 'abcd']));
log(canConstruct("skateboard", ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']));
log(canConstruct("enterapotentpot", ['a', 'p', 'ent', 'enter', 'ot', 'o', 't']));
log(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", ['e', 'ee', 'eee', 'eeee', 'eeeee', 'eeeeee']));
```

## 7. Count Construct

```javascript
function countConstruct(target, wordBank, memo = {}) {
  if (target in memo) return memo[target];
  if (target === "") return 1;

  let totalCount = 0;

  for (let word of wordBank) {
    if (target.indexOf(word) === 0) {
      const suffix = target.slice(word.length);
      const numWaysForRest = countConstruct(suffix, wordBank, memo);
      totalCount += numWaysForRest;
    }
  }
  memo[target] = totalCount;
  return totalCount;
}


log(countConstruct("abcdef", ['ab', 'abc', 'cd', 'def', 'abcd']));
log(countConstruct("skateboard", ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']));
log(countConstruct("enterapotentpot", ['a', 'p', 'ent', 'enter', 'ot', 'o', 't']));
log(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", ['e', 'ee', 'eee', 'eeee', 'eeeee', 'eeeeee']));
```

## 8. All Construct

```javascript
function allConstruct(target, wordBank, memo = {}) {
  if (target in memo) return memo[target];
  if (target === '') return [[]];

  const result = [];

  for (let word of wordBank) {
    if (target.indexOf(word) === 0) {
      const suffix = target.slice(word.length);
      const suffixWays = allConstruct(suffix, wordBank, memo);
      const targetWays = suffixWays.map(way => [word, ...way]);
      result.push(...targetWays);
    }
  }

  memo[target] = result;
  return result;

}


log(allConstruct("purple", ['purp', 'p', 'ur', 'le', 'purpl']));
log(allConstruct("abcdef", ['ab', 'abc', 'cd', 'def', 'abcd', 'ef', 'c']));
log(allConstruct("skateboard", ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']));
log(allConstruct("eeeee", ['e', 'ee', 'eee', 'eeee', 'eeeee', 'eeeeee']));
```

## 9. Fib using tabulation

```javascript
function fib(n) {
  const table = Array(n + 1).fill(0);
  table[1] = 1;

  for (let i = 0; i <= n; i++) {
    table[i + 1] += table[i];
    table[i + 2] += table[i];
  }

  return table[n];

}

log(fib(6));
log(fib(7));
log(fib(8));
log(fib(50));
```

## 10. Grid Traveler using tabulation

```javascript
function gridTraveler(m, n) {
  const table = Array(m + 1).fill().map(() => Array(n + 1).fill(0));
  table[1][1] = 1;

  for (let i = 0; i <= m; i++) {
    for (let j = 0; j <= n; j++) {
      const current = table[i][j];

      if (i + 1 <= m) table[i + 1][j] += current;
      if (j + 1 <= n) table[i][j + 1] += current;
    }
  }
  
  return table[m][n];
}



log(gridTraveler(1, 1));
log(gridTraveler(2, 3));
log(gridTraveler(3, 2));
```

## 3. Can Sum using tabulation

```javascript
function canSum(target, numbers) {

  const arr = Array(target + 1).fill(false);
  arr[0] = true;

  for (let i = 0; i <= arr.length; i++) {
    if (arr[i]) {
      for (let n of numbers) {
        if (i + n <= target) {
          arr[i + n] = true;
        }
      }
    }


  }

  return arr[target];
}

log(canSum(7, [5, 3, 4]));
log(canSum(7, [2, 3]));
log(canSum(7, [2, 4]));
log(canSum(7, [2, 3, 5]));
log(canSum(300, [7, 14]));
```

## 3. How Sum using tabulation

```javascript
function howSum(target, numbers) {

  const arr = Array(target + 1).fill(null);
  arr[0] = [];

  for (let i = 0; i <= arr.length; i++) {
    if (arr[i]) {
      for (let n of numbers) {
        if (i + n <= target) {
          arr[i + n] = [...arr[i], n];
        }
      }
    }


  }

  return arr[target];
}

log(howSum(7, [5, 3, 4]));
log(howSum(7, [2, 3]));
log(howSum(7, [2, 4]));
log(howSum(7, [2, 3, 5]));
log(howSum(300, [7, 14]));
```


## 3. Best Sum using tabulation

```javascript
function bestSum(target, numbers) {

  const arr = Array(target + 1).fill(null);
  arr[0] = [];

  for (let i = 0; i <= arr.length; i++) {
    if (arr[i]) {
      for (let n of numbers) {
        if (i + n <= target) {
          const combination = [...arr[i], n];
          if (!arr[i + n] || arr[i + n].length >= combination.length) {
            arr[i + n] = combination;
          }
        }
      }
    }
  }

  return arr[target];
}

log(bestSum(8, [2, 3, 5]));
log(bestSum(7, [2, 4, 3, 5, 1, 6, 7]));
```



## 3. Can Construct using tabulation

```javascript
function canConstruct(target, wordBank) {

  const arr = Array(target.length + 1).fill(false);
  arr[0] = [];

  for (let i = 0; i <= arr.length; i++) {
    if (arr[i]) {
      for (let word of wordBank) {
        if (target.slice(i, i + word.length) === word) {
          arr[i + word.length] = true;
        }
      }
    }


  }

  return arr[target.length];
}


log(canConstruct("abcdef", ['ab', 'abc', 'cd', 'def', 'abcd']));
log(canConstruct("skateboard", ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']));
log(canConstruct("enterapotentpot", ['a', 'p', 'ent', 'enter', 'ot', 'o', 't']));
log(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", ['e', 'ee', 'eee', 'eeee', 'eeeee', 'eeeeee']));
```

## 3. Count Construct using tabulation

```javascript
function countConstruct(target, wordBank) {

  const arr = Array(target.length + 1).fill(0);
  arr[0] = 1;

  for (let i = 0; i <= arr.length; i++) {
    if (arr[i]) {
      for (let word of wordBank) {
        if (target.slice(i, i + word.length) === word) {
          arr[i + word.length] += arr[i];
        }
      }
    }
  }

  return arr[target.length];
}


log(countConstruct("purple", ['purp', 'p', 'ur', 'le', 'purpl']));
log(countConstruct("abcdef", ['ab', 'abc', 'cd', 'def', 'abcd']));
log(countConstruct("skateboard", ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']));
log(countConstruct("enterapotentpot", ['a', 'p', 'ent', 'enter', 'ot', 'o', 't']));
log(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", ['e', 'ee', 'eee', 'eeee', 'eeeee', 'eeeeee']));
```

## 3. Can Sum

```javascript
```

## 3. Can Sum

```javascript
```

