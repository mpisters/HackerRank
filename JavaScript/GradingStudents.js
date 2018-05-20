function gradingStudents(grades) {
    return grades.map((grade ) => {
        if (grade < 38){
            return grade;
        }
        if (grade % 5 == 0) {
            return grade;
        }
        if (grade >= 38 && grade % 5 != 0){
            let nextPower5 = Math.ceil(grade / 5) * 5;
            return nextPower5 - grade < 3 ? nextPower5 : grade;
        }
    })

}
