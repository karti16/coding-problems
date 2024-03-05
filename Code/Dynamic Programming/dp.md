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

## 3. Can Sum

```javascript
```

## 3. Can Sum

```javascript
```

## 3. Can Sum

```javascript
```

## 3. Can Sum

```javascript
```

## 3. Can Sum

```javascript
```

