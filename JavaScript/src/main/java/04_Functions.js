// Functions
// Function declaration
// function greet(name) {
//     console.log("Hello " + name)
// }

// Function Expression
// const greet2 = function greet2(name) {
//     console.log("Hello", name)
// }
// greet("Yurachel")
// greet2("Marsy")

// Анонимные функции.
// let counter = 0
// const interval = setInterval(function () {
//     if (counter === 5) {
//         clearInterval(interval) // clearTimeout
//     }
//
//     console.log(++counter)
// }, 1000)

//Стрелочные функции.
//
// function greet(name) {
//     console.log("Hay", name)
//
// }
//
// const arrow = (name) => {
//     console.log(name)
// }
// const arrow2 = name => console.log("HAy", name)
// arrow2("Yurachel")
//
// const pow2 = num => num ** 2
// console.log(pow2(2))
//
// //Параметры по умолчанию.
// const sum = (a=24, b=5) => a + b
// console.log(sum())
// function  sumAll(...all){
//     let sum = 0
//     for(let num of all){
//         sum+=num
//     }
//     return sum
// }
// const res = sumAll(1,5,4,2,24)
// console.log(res)

// Замыкания
// function createMember(name) {
//     return function (lastName) {
//         console.log(name + lastName)
//     }
// }
// const logwithLastName = createMember("Yurachel")
// console.log(logwithLastName("Keks"))
// console.log(logwithLastName("Marsy"))
