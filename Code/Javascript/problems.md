# Javascript Coding-challenge

## List of Problems

| S. no | Problem                                         |
| ----- | ----------------------------------------------- |
| 1.    | [Function Composition](#1-function-composition) |
| 2.    | [Curried Function](#2-curried-function)         |
| 3.    | [Sleep](#3-sleep)                               |
| 4.    | [Promise Time Limit](#4-promise-time-limit)     |
| 5.    | [Promise Pool](#5-promise-pool)                 |
| 6.    | [Cache With Time Limit](#5-promise-pool)        |
| 7.    | [Debounce](#7-debounce)                         |
| 8.    | [Throttle](#8-throttle)                         |
| 9.    | [Objects Deep Equal](#9-objects-deep-equal)     |

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

## 4. Promise Time Limit

[Question link](https://leetcode.com/problems/promise-time-limit/description/)

[Video Solution Link](https://www.youtube.com/watch?v=hfH57rdZhOk&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=12&t=375s)

```javascript
const timeLimit = function (fn, t) {
  return async function (...args) {
    return new Promise((resolve, reject) => {
      const id = setTimeout(() => reject('Time Limit Exceeded'), t);
      fn(...args)
        .then((res) => resolve(res))
        .catch((err) => reject(err))
        .finally(() => clearTimeout(id));
    });
  };
};

const limited = timeLimit((t) => new Promise((res) => setTimeout(res, t)), 100);
limited(150).catch(console.log); // "Time Limit Exceeded" at t=100ms
```

**[⬆ Back to Top](#list-of-problems)**

## 5. Promise Pool

[Question link]()

[Video Solution Link](https://www.youtube.com/watch?v=DB8pAAg-9xw&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=13)

```javascript
const promisePool = async function (functions, n) {
  return new Promise((resolve, reject) => {
    let i = 0;
    let inProgress = 0;
    callback();

    function callback() {
      while (i < functions.length && inProgress < n) {
        functions[i++]().then(() => {
          inProgress--;
          callback();
        });
        inProgress++;
      }

      if (i === functions.length && inProgress === 0) {
        resolve(counter);
      }
    }
  });
};

// ------------------------

const promisePool = async function (functions, n) {
  let i = 0;
  async function callback() {
    if (i === functions.length) {
      return;
    }
    await functions[i++]();
    await callback();
  }

  const nPromises = Array(n).fill().map(callback);
  await Promise.all(nPromises);
};
let counter = 0;
const sleep = (t) =>
  new Promise((res) =>
    setTimeout(() => {
      console.log(++counter);
      res();
    }, t),
  );
promisePool(
  [
    () => sleep(1000),
    () => sleep(1000),
    () => sleep(1000),
    () => sleep(1000),
    () => sleep(1000),
    () => sleep(1000),
    () => sleep(1000),
  ],
  2,
).then((res) => console.log('final--', res));
```

**[⬆ Back to Top](#list-of-problems)**

## 6. Cache With Time Limit

[Question link](https://leetcode.com/problems/cache-with-time-limit/description/)

[Video Solution Link](https://www.youtube.com/watch?v=w772gtNK0Gw&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=14)

```javascript
class TimeLimitedCache {
  cache = new Map();

  set(key, value, duration) {
    const alreadyExists = this.cache.get(key);
    if (alreadyExists) {
      clearTimeout(alreadyExists.timerId);
    }

    let timerId = setTimeout(() => {
      this.cache.delete(key);
    }, duration);

    this.cache.set(key, { value, timerId });
    return Boolean(alreadyExists);
  }

  get(key) {
    if (this.cache.has(key)) return this.cache.get(key).value;
    return -1;
  }

  count() {
    return this.cache.size;
  }
}
// ----------------------

const TimeLimitedCache = function () {
  this.cache = new Map();
};

TimeLimitedCache.prototype.set = function (key, value, duration) {
  const alreadyExists = this.cache.get(key);
  if (alreadyExists) {
    clearTimeout(alreadyExists.timerId);
  }

  let timerId = setTimeout(() => {
    this.cache.delete(key);
  }, duration);

  this.cache.set(key, { value, timerId });
  return Boolean(alreadyExists);
};

TimeLimitedCache.prototype.get = function (key) {
  if (this.cache.has(key)) return this.cache.get(key).value;
  return -1;
};

TimeLimitedCache.prototype.count = function () {
  return this.cache.size;
};

var obj = new TimeLimitedCache();
console.log(obj.set(1, 42, 1000)); // false
console.log(obj.get(1)); // 42
console.log(obj.count()); // 1
```

**[⬆ Back to Top](#list-of-problems)**

## 7. Debounce

[Question link](https://leetcode.com/problems/debounce/description/)

[Video Solution Link](https://www.youtube.com/watch?v=1sxSpnxNx5w&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=15)

```javascript
var debounce = function (fn, t) {
  let timerId;
  return function (...args) {
    if (timerId) {
      clearTimeout(timerId);
    }
    timerId = setTimeout(() => {
      fn(...args);
    }, t);
  };
};

const log = debounce(console.log, 100);
log('Hello'); // cancelled
log('Hello'); // cancelled
log('Hello'); // cancelled
log('Hello'); // cancelled
log('Hello'); // cancelled
log('Hello'); // cancelled
log('Hello'); // Logged at t=100ms
```

**[⬆ Back to Top](#list-of-problems)**

## 8. Throttle

[Question link]()

[Video Solution Link](https://www.youtube.com/watch?v=zyGZV_fIQWk&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=16)

```javascript
const throttle = function (fn, t) {
  let isThrottled = false;
  let newArgs = null;
  return function (...args) {
    if (isThrottled) {
      newArgs = args;
    } else {
      fn(...args);
      isThrottled = true;
      setTimeout(helper, t);
    }

    function helper() {
      if (newArgs) {
        fn(...newArgs);
        newArgs = null;
        isThrottled = true;
        setTimeout(helper, t);
      } else {
        isThrottled = false;
      }
    }
  };
};

const throttled = throttle(console.log, 100);
throttled('log1');
throttled('log2');
throttled('log3');
```

**[⬆ Back to Top](#list-of-problems)**

## 9. Objects Deep Equal

[Question link]()

[Video Solution Link](https://www.youtube.com/watch?v=4JVZ-mVqJPg&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=17)

```javascript
const a1 = { x: 1, y: 2 };
const a2 = { x: 1, y: 2 };

const b1 = { y: 1, x: 2 };
const b2 = { y: 1, x: 2 };

const c1 = { x: null, L: [1, 2, 3] };
const c2 = { x: null, L: ['1', '2', '3'] };

function areDeeplyEqual(o1, o2) {
  if (o1 === null || o2 === null) {
    return o1 === o2;
  }
  if (typeof o1 !== typeof o2) {
    return false;
  }

  // primitives
  if (typeof o1 !== 'object') {
    return o1 === o2;
  }

  // Arrays
  if (Array.isArray(o1) || Array.isArray(o2)) {
    if (String(o1) !== String(o2)) {
      return false;
    }

    for (let i = 0; i < o1.length; i++) {
      if (!areDeeplyEqual(o1[i], o2[i])) {
        return false;
      }
    }
  }
  // Objects
  else {
    if (Object.keys(o1).length !== Object.keys(o2).length) {
      return false;
    }
    for (let key in o1) {
      if (!areDeeplyEqual(o1[key], o2[key])) {
        return false;
      }
    }
  }
  return true;
}

console.log(areDeeplyEqual(a1, a2));
console.log(areDeeplyEqual(b1, b2));
console.log(areDeeplyEqual(c1, c2));
```

**[⬆ Back to Top](#list-of-problems)**

## 1. title

[Question link]()

[Video Solution Link]()

```javascript

```

**[⬆ Back to Top](#list-of-problems)**
