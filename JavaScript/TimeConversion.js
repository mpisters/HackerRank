function timeConversion(s) {
    let pmOrAm = s.split("").slice(s.length - 2, s.length).join("");
    let hour = parseInt(s.split("").slice(0, 2).join(""));
    if (pmOrAm == 'PM'){
        let newHour = hour != 12 ? parseInt(hour) + 12 : 12;
        return newHour + s.split("").slice(2, s.length -2).join("");
    }
    if (s == '00:00:00AM') {
        return '24:00:00'
    }
    if (hour == 12 && pmOrAm == 'AM'){
        return '00' + s.split("").slice(2, s.length -2).join("");
    }
    return s.split("").slice(0, s.length - 2).join("");

}
