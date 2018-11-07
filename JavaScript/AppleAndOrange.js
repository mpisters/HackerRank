function countApplesAndOranges(s, t, a, b, apples, oranges) {
    let validApples = apples.map( item => item + a).filter(number => number >= s && number <= t);
    let validOranges = oranges.map( item => item + b).filter(number => number >= s && number <= t);
    console.log(validApples.length);
    console.log(validOranges.length);
}
