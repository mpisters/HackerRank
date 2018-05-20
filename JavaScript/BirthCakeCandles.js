function birthdayCakeCandles(n, ar) {
    let maxValue = Math.max(...ar);
    return ar.filter(item => item == maxValue).length;
}
