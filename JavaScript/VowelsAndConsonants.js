function vowelsAndConsonants(s) {
    let vowels = s.split("").filter((char) => ['a', 'e', 'i', 'o', 'u'].includes(char)).map(char => console.log(char))
    let constonants = s.split("").filter((char) => !['a', 'e', 'i', 'o', 'u'].includes(char)).map(char => console.log(char))
}
