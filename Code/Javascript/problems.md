# Javascript Coding-challenge

## List of Problems

| S. no | Problem                                                              |
| ----- | -------------------------------------------------------------------- |
| 1.    | [Function Composition](#1-function-composition)                      |
| 2.    | [Curried Function](#2-curried-function)                              |
| 3.    | [Sleep](#3-sleep)                                                    |
| 4.    | [Promise Time Limit](#4-promise-time-limit)                          |
| 5.    | [Promise Pool](#5-promise-pool)                                      |
| 6.    | [Cache With Time Limit](#5-promise-pool)                             |
| 7.    | [Debounce](#7-debounce)                                              |
| 8.    | [Throttle](#8-throttle)                                              |
| 9.    | [Objects Deep Equal](#9-objects-deep-equal)                          |
| 10.   | [Objects to JSON](#10-objects-to-json)                               |
| 11.   | [JSON to Matrix](#11-json-to-matrix)                                 |
| 12.   | [Difference Between Two Objects](#12-difference-between-two-objects) |
| 13.   | [Chunk Array](#13-chunk-array)                                       |
| 14.   | [Flatten Deeply Nested Array](#14-flatten-deeply-nested-array)       |
| 15.   | [Event Emitter](#15-event-emitter)                                   |
| 16.   | [Array Wrapper](#16-array-wrapper)                                   |
| 17.   | [Generate Fibonacci Sequence](#17-generate-fibonacci-sequence)       |
| 18.   | [Nested Array Generator](#18-nested-array-generator)                 |

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

## 10. Objects to JSON

[Question link]()

[Video Solution Link](https://www.youtube.com/watch?v=f94fUbHU-FY&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=18)

```javascript
const obj = {
  name: 'karthik',
  age: 27,
  address: {
    street: '10th street',
    houseNo: 12,
  },
  marks: [1, 2, 3, '4'],
};

const res = jsonStringify(obj);
console.log(res);

function jsonStringify(obj) {
  // null || undefined
  if (obj === null || obj === undefined) {
    return String(obj);
  }

  // Arrays
  if (Array.isArray(obj)) {
    const values = obj.map((i) => jsonStringify(i));
    return `[${values.join(',')}]`;
  }

  // Objects
  if (typeof obj === 'object') {
    const keys = Object.keys(obj);
    const keyValPair = keys.map((k) => `"${k}":${jsonStringify(obj[k])}`);
    return `{${keyValPair.join(',')}}`;
  }

  // Strings
  if (typeof obj === 'string') {
    return `"${obj}"`;
  }

  return String(obj);
}
```

**[⬆ Back to Top](#list-of-problems)**

## 11. JSON to Matrix

[Question link]()

[Video Solution Link](https://www.youtube.com/watch?v=LJwgAMHGcI0&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=19)

```javascript
const arr = [
  { b: 1, a: 2 },
  { b: 3, a: { c: 5, d: 9 } },
];

const res = jsonToMatrix(arr);
console.log(res);

function jsonToMatrix(arr) {
  const keySet = new Set();

  for (const obj of arr) {
    getKeys(obj, '');
  }

  const keys = Array.from(keySet).sort();
  const res = [keys];

  for (const obj of arr) {
    const keyToVal = {};
    getValues(obj, '', keyToVal);
    const row = [];
    for (const key of keys) {
      if (key in keyToVal) {
        row.push(keyToVal[key]);
      } else {
        row.push('');
      }
    }
    res.push(row);
  }

  return res;

  function getKeys(obj, path) {
    console.log(obj);
    for (const key in obj) {
      const newPath = path ? `${path}.${key}` : key;
      if (isObject(obj[key])) {
        getKeys(obj[key], newPath);
      } else {
        keySet.add(newPath);
      }
    }
  }

  function getValues(obj, path, keyToVal) {
    for (const key in obj) {
      const newPath = path ? `${path}.${key}` : key;
      if (isObject(obj[key])) {
        getValues(obj[key], newPath, keyToVal);
      } else {
        keyToVal[newPath] = obj[key];
      }
    }
  }

  function isObject(obj) {
    return obj !== null && typeof obj === 'object';
  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 12. Difference Between Two Objects

[Question link]()

[Video Solution Link](https://www.youtube.com/watch?v=gH7oZs1WZfg&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=20)

```javascript
const obj1 = {
  a: 1,
  v: 3,
  x: [],
  z: {
    a: null,
  },
};

const obj2 = {
  a: 2,
  v: 4,
  x: [],
  z: {
    a: 2,
  },
};

const res = objDiff(obj1, obj2);
console.log(res);

function objDiff(o1, o2) {
  // only care about common keys
  // If both primitive and diff, then diff
  if (!isObject(o1) || !isObject(o2)) {
    // both primitive
    return o1 === o2 ? {} : [o1, o2];
  }
  // If one is obj and other isnt, then diff
  if (!isObject(o1) || !isObject(o2)) {
    // one is primitive
    return [o1, o2];
  }
  // If one is array and one is object, then diff
  if (Array.isArray(o1) !== Array.isArray(o2)) {
    return [o1, o2];
  }
  // If both arr, or both object, then recursion
  const diff = {};
  for (const key in o1) {
    if (o2.hasOwnProperty(key)) {
      const res = objDiff(o1[key], o2[key]);
      if (Object.keys(res).length > 0) {
        diff[key] = res;
      }
    }
  }

  return diff;

  function isObject(obj) {
    return obj !== null && typeof obj === 'object';
  }
}
```

**[⬆ Back to Top](#list-of-problems)**

## 13. Chunk Array

[Question link](https://leetcode.com/problems/chunk-array/description/)

[Video Solution Link](https://www.youtube.com/watch?v=VUN-O3B9ceY&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=21)

```javascript
const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11];
const res = chunk(arr, 3);
console.log(res);

function chunk(arr, size) {
  const res = [];
  let subArray = [];

  for (let i = 0; i < arr.length; i++) {
    subArray.push(arr[i]);
    if (subArray.length === size) {
      res.push(subArray);
      subArray = [];
    }
  }
  if (subArray.length) {
    res.push(subArray);
  }
  return res;
}

function chunk1(arr, size) {
  const res = [];
  for (let i = 0; i < arr.length; i += size) {
    let sub = arr.slice(i, i + size);
    res.push(sub);
  }
  return res;
}
```

**[⬆ Back to Top](#list-of-problems)**

## 14. Flatten Deeply Nested Array

[Question link](https://leetcode.com/problems/flatten-deeply-nested-array/description/)

[Video Solution Link](https://www.youtube.com/watch?v=_DetLPKtFNk&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=22)

```javascript
const arr = [1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]];
const depth = 1;

const result = flatten(arr, depth);
console.log(result);

function flatten(arr, n) {
  const res = [];

  function helper(arr, depth) {
    for (const val of arr) {
      if (Array.isArray(val) && depth < n) {
        helper(val, depth + 1);
      } else {
        res.push(val);
      }
    }

    return res;
  }

  return helper(arr, 0);
}
```

**[⬆ Back to Top](#list-of-problems)**

## 15. Event Emitter

[Question link](https://leetcode.com/problems/event-emitter/description/)

[Video Solution Link](https://www.youtube.com/watch?v=M69bjWFarU0&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=27)

```javascript
class EventEmitter {
  eventMap = {};

  subscribe(event, cb) {
    if (!this.eventMap.hasOwnProperty(event)) {
      this.eventMap[event] = new Set();
    }
    this.eventMap[event].add(cb);

    return {
      unsubscribe: () => {
        this.eventMap[event].delete(cb);
      },
    };
  }

  emit(event, args = []) {
    const res = [];
    (this.eventMap[event] ?? []).forEach((cb) => res.push(cb(...args)));
    return res;
  }
}

const emitter = new EventEmitter();
const sub = emitter.subscribe('onClick', callbackFun);
console.log(emitter.emit('onClick'));
sub.unsubscribe();
console.log(emitter.emit('onClick'));

function callbackFun() {
  return '99';
}
```

**[⬆ Back to Top](#list-of-problems)**

## 16. Array Wrapper

[Question link](https://leetcode.com/problems/array-wrapper/description/)

[Video Solution Link](https://www.youtube.com/watch?v=XoGjPdPTAVA&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=28)

```javascript
const ArrayWrapper = function (nums) {
  this.nums = nums;
};

ArrayWrapper.prototype.valueOf = function () {
  return this.nums.reduce((a, c) => a + c, 0);
};

ArrayWrapper.prototype.toString = function () {
  return JSON.stringify(this.nums);
};

const arr1 = new ArrayWrapper([1, 2]);
const arr2 = new ArrayWrapper([3, 4]);

console.log(arr1 + arr2);
console.log(String(arr1));
```

**[⬆ Back to Top](#list-of-problems)**

## 17. Generate Fibonacci Sequence

[Question link](https://leetcode.com/problems/generate-fibonacci-sequence/)

[Video Solution Link](https://www.youtube.com/watch?v=T643rQ70Jlk&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=29)

```javascript
const fibGenerator = function* () {
  let n1 = 0;
  let n2 = 1;
  while (true) {
    yield n1;
    [n1, n2] = [n2, n1 + n2];
  }
};

const gen = fibGenerator();

console.log(gen.next().value); // 0
console.log(gen.next().value); // 1
console.log(gen.next().value); // 1
console.log(gen.next().value); // 2
console.log(gen.next().value); // 3
console.log(gen.next().value); // 5
console.log(gen.next().value); // 8
console.log(gen.next().value); // 13
```

**[⬆ Back to Top](#list-of-problems)**

## 18. Nested Array Generator

[Question link](https://leetcode.com/problems/nested-array-generator/description/)

[Video Solution Link](https://www.youtube.com/watch?v=yo-J1jQaZYU&list=PLQpVsaqBj4RIpDQIVowFni58LsK4cM9Qz&index=30)

```javascript
var inorderTraversal = function* (arr) {
  for (const n of arr) {
    if (Array.isArray(n)) {
      yield* inorderTraversal(n);
    } else {
      yield n;
    }
  }
};

const gen = inorderTraversal([1, [2, 3]]);
console.log(gen.next().value); // 1
console.log(gen.next().value); // 2
console.log(gen.next().value); // 3
```

**[⬆ Back to Top](#list-of-problems)**

## 19. Concurrently run tasks

- you have a list of 1000 items
- you have an async function `process(item)`
- you need to process all items
- it needs to be done concurrently, but not more than 25 at a time
- collect items with errors

[github link](https://github.com/sindresorhus/p-queue)

[twitter Link](https://twitter.com/thdxr/status/1686856181745111040?s=20)

```javascript
const taskPromise = (idx, task = null) =>
  new Promise((resolve) => {
    if (!task) {
      resolve(idx);
    }

    task
      .then(() => {
        resolve(idx);
      })
      .catch(() => {
        resolve(idx);
      });
  });

let running = 0;

const process = async (item) => {
  await new Promise((r) => {
    setTimeout(() => {
      // console.log("result", item);
      running--;
      r();
    }, Math.random() * 2000);
  });
};

const test = async () => {
  const items = Array.from({ length: 10 }, (_, idx) => idx);
  const tasks = Array.from({ length: 2 }, (_, idx) => taskPromise(idx));

  for (const item of items) {
    running++;
    const idx = await Promise.race(tasks);
    console.log('running', running);
    tasks[idx] = taskPromise(
      idx,
      process(item).catch((err) => console.error(err)),
    );
  }
};

test();
```

**[⬆ Back to Top](#list-of-problems)**

## 1. title

[Question link]()

[Video Solution Link]()

```javascript

```

**[⬆ Back to Top](#list-of-problems)**
