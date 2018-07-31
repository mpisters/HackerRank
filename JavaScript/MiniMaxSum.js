function getArray(arr, number){
    let newArr = [];
    for (let i =0; i < arr.length; i++){
        if(i != number){
            newArr.push(arr[i])
        }
    }
    return newArr;
}

// Complete the miniMaxSum function below.
function miniMaxSum(arr) {
    let initMax = arr.slice(0,arr.length - 1).reduce((first, second) => first+second);
    let initMin = arr.slice(0,arr.length - 1).reduce((first, second) => first+second);
    for (let i = 0; i < arr.length ; i++){
        let testArr = getArray(arr, i);
        let newNumber = testArr.reduce((first,second) => first+second);
        if (initMax < newNumber){
            initMax = newNumber;
        }
        if (initMin > newNumber){
            initMin = newNumber;
        }
    }
    console.log(initMin + " " + initMax);
}
