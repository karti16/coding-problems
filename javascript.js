function sampler(callback, count = 1) {
  let track = 0;

  return (...args) => {
    track++;

    if (track === count) {
      callback(...args);
      track = 0;
    }
  };
}

function message(msg) {
  console.log(msg);
}

const sample = sampler(message, 4);

sample();
sample();
sample();
sample('abs');
sample();
sample();
sample();
sample('abs');

// abs
// abs
