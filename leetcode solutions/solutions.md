## 1. <a href="https://placeholder.com/" target="_blank">Opens in new tab</a>

```javascript
Array.prototype.customShift = function () {
  let array = this;
  let result = array[0];

  for (let i = 0; i < this.length; i++) {
    array[i] = array[i + 1];
  }
  array.length = array.length - 1;
  return result;
};
```

---
