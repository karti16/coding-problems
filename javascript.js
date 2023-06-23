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
