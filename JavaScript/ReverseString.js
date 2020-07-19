function reverseString(s) {
  try {
    let reversed = s.split('').reverse().join('');
    console.log(reversed);
  } catch (exception) {
    console.log(exception.message);
    console.log(s);
  }
}
