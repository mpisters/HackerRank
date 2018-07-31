function diagonalDifference(a) {
    let first = 0;
    let second = a.length -1;
    let total1 = 0;
    let total2 = 0;
    for (let i = 0; i < a.length; i++){
        let arr = a[i];
        for(let j = 0; j < arr.length; j++){
            if(j == first && i == first){
                total1 += arr[j]
                first++;

            }
            if(j == second){
                total2 +=arr[j]
                second--;
            }
        }


    }
    return Math.abs(total1 - total2);

}
