# Javascript Coding-challenge

## List of Problems

| S. no | Problem                                         |
| ----- | ----------------------------------------------- |
| 1.    | [Function Composition](#1-function-composition) |
| 2.    | [Curried Function](#2-curried-function)         |
| 3.    | [Sleep](#3-sleep)                               |

## 1. Function Composition

[Question link](https://leetcode.com/problems/function-composition/)

[Video Solution Link](https://www.youtube.com/watch?v=mIFw1H7Ljco&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=7)

```javascript
const fn = compose([(x) => x + 1, (x) => 2 * x]);
fn(4); // 9

const compose = function (functions) {
  return function (x) {
    for (const fn of functions.reverse()) {
      x = fn(x);
    }
    return x;
  };
};

// -----------

const compose = function (functions) {
  const fn = (acc, fn) => fn(acc);
  return function (x) {
    return functions.reduceRight(fn, x);
  };
};
```

**[⬆ Back to Top](#list-of-problems)**

## 2. Curried Function

[Question link]()

[Video Solution Link](https://www.youtube.com/watch?v=pi4kqMWQXxA&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=10)

```javascript
const curry = function (fn) {
  return function curried(...args) {
    if (args.length === fn.length) {
      return fn(...args);
    } else {
      return function (...newArgs) {
        return curried(...newArgs, ...args);
      };
    }
  };
};

// --------------------------------------

const curry = function (fn) {
  let nums = [];
  return function curried(...args) {
    nums = [...nums, ...args];
    if (nums.length === fn.length) {
      const res = fn(...nums);
      nums = [];
      return res;
    } else {
      return curried;
    }
  };
};

const sum = (a, b, c) => a + b + c;
const csum = curry(sum);

console.log(csum(1, 2, 3));

console.log(csum(1)(2)(3));
```

**[⬆ Back to Top](#list-of-problems)**

## 3. Sleep

[Question link](https://leetcode.com/problems/sleep/description/)

[Video Solution Link](https://www.youtube.com/watch?v=hfH57rdZhOk&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=12)

```javascript
async function sleep(millis) {
  function callback(resolve, reject) {
    setTimeout(resolve, millis);
  }

  return new Promise(callback);
}

// -------------------------
async function sleep(millis) {
  await new Promise((resolve, reject) => {
    setTimeout(resolve, millis);
  });
}

let t = Date.now();
sleep(1000).then(() => console.log(Date.now() - t)); // 100
```

**[⬆ Back to Top](#list-of-problems)**

## 1. title

[Question link]()

[Video Solution Link]()

```javascript

```

**[⬆ Back to Top](#list-of-problems)**

## 1. title

[Question link]()

[Video Solution Link]()

```javascript

```

**[⬆ Back to Top](#list-of-problems)**

## 1. title

[Question link]()

[Video Solution Link]()

```javascript

```

**[⬆ Back to Top](#list-of-problems)**
