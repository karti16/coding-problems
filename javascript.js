const axios = require('axios');
// trans_item_id;
// sale_trans_id;
// both_sale_trans_id;
const token =
  'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoicGIuLnBhbGxpa2FyYW5haSIsImlkIjoxOCwiZW1wbG95ZWVfaWQiOjE4LCJjb21wYW55X2lkIjozLCJjb21wYW55X3R5cGUiOjIsInVzZXJfbG9jYXRpb24iOls3XSwic3Vic2NyaXB0aW9uRW5kVGltZSI6IjIwMjQtMDQtMDEgMjI6NTg6NDUiLCJyb2xlX2lkIjo5LCJyb2xlX25hbWUiOiJQb3N1c2VyTWFpbiIsImlhdCI6MTY4ODIwMzgwNiwiZXhwIjoxNjg4MjkwMjA2LCJpc3MiOiJwb3MudnR0LmltIn0.Du__6mTdT5diA4QSIXdu0JETywmPDJut3yX09W3TJP0';
const config = {
  headers: { Authorization: `Bearer ${token}`, ['Content-Type']: 'application/json' },
};
const url = 'http://localhost:4000/devTesting/costPriceCheck';
function trans_item_id() {
  return axios.post(url, { type: 'trans_item_id' }, config);
}

function sale_trans_id() {
  return axios.post(url, { type: 'sale_trans_id' }, config);
}
function both_sale_trans_id() {
  return axios.post(url, { type: 'both_sale_trans_id' }, config);
}

Promise.all([trans_item_id(), sale_trans_id(), both_sale_trans_id()])
  .then(function (results) {
    const trans_cost_price = results[0].data;
    const sale_id_cost_price = results[1].data;
    const sale_trans_id = results[2].data;

    console.log(sale_trans_id.length);
    console.log(sale_id_cost_price.length);
    console.log(sale_trans_id.length);

    // console.log(sale_trans_id.length);
    // console.log(sale_id_cost_price.length);
    // console.log(sale_trans_id.length);
    let falseCounter = 0;
    let trueCounter = 0;
    let res = [];

    for (const id of sale_trans_id) {
      const sP = sale_id_cost_price.find((i) => i.sale_trans_id === id.sale_trans_id);
      const tP = trans_cost_price.find((i) => i.trans_item_id === id.trans_item_id);
      if (sP.trans_items_cost_price === tP.trans_items_cost_price) {
        trueCounter++;
      } else {
        res.push({ id, sP, tP });
        falseCounter++;
      }
    }

    console.log({ trueCounter, falseCounter });
    const a = res.flatMap((i) => [i.sP.sale_trans_id, i.tP.trans_item_id]).sort((a, b) => a - b); //i.tP.trans_item_id

    for (let i = 0; i < a.length; i += 5) {
      console.log(a.slice(i, i + 5));
    }
  })
  .catch((err) => console.log(err));
