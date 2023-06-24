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
