function kangaroo(x1, v1, x2, v2) {
    if (v1 > v2 && x1 < x2) {
        let xDiff = Math.abs(x1 - x2);
        let vDiff = Math.abs(v1  - v2);
        if (xDiff % vDiff == 0){
        return 'YES';
        } else {
            return 'NO';
        }

    } else{
        return 'NO'
    }

}
