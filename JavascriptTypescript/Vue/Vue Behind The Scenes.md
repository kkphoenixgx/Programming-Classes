# Vue Behind The Scenes
2024-10-21
tags: [[-indexVue]]

## Vue Reactivity

Vue works with javascript Proxys, its's a way of change already created composed values before running the code:

```javascript
let validator = {
  set: function(obj, prop, value) {
    if (prop === 'age') {
      if (!Number.isInteger(value)) {
        throw new TypeError('The age is not an integer');
      }
      if (value > 200) {
        throw new RangeError('The age seems invalid');
      }
    }

    // The default behavior to store the value
    obj[prop] = value;

    // Indicate success
    return true;
  }
};

const person = new Proxy({}, validator);
```

## How Vue Updates the DOM

![[Pasted image 20241021164206.png]]


