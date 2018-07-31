function plusMinus(arr) {
    let pos = 0;
    let neg = 0;
    let zero = 0;
    for (let i = 0; i < arr.length ; i++){
        if (arr[i] > 0){
            pos++;
        } if (arr[i] == 0) {
            zero++;
        } if (arr[i] < 0){
            neg++;
        }
    }
    let newArr = [pos, neg, zero].map(el => console.log(el / arr.length));

}
