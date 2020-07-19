function factorial(number) {
  let range = [...Array(number + 1).keys()];
  range.shift();
  let total = range.reduce((a, b) => a * b);
  return total;
}
