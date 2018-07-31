function staircase(n) {
    let whitespace = " ";
    let countDown = n - 1;
    let symbol = "#";
    for (let i = 0; i < n ;i++){
        let whitespaces = whitespace.repeat(countDown)
        let symbols = "#".repeat((n - countDown));
        console.log(whitespaces + symbols);
        countDown--;
    }

}
