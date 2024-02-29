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