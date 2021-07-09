// 1.Переменные
// var name = 'Yurachel' // Устаревшее,не использовать.
// const lastName = 'Marsy' // Константа,типа final в java.
// let age = 26

// 2.Мутирование(конкатенация).Как в java.
// console.log(name + " of our user.His age is " + age) // Выводит значение на консоль в браузере
//Браузерные функции javaScript.
// alert('Hello') // Эта функция содержится в браузере.Т.е. при запуске
// const last = prompt("Enter your lastname: ") // Окно ввода в браузере.
// alert(name + " - her name, her last Name : "  + last)

//3 Операторы.(+,-,*,/,++,--,+=,*=,/=,-=) Как in java.
// const currentYear = 2021
// const birthYear = 1994
// const age = currentYear - birthYear
//
// alert(age)

//4.Типы данных 5 примитивных(number,String,boolean,undefined,null)
// const age2 = 25
// const isProgrammer = false
// const Name = "Yurachel"
// let x
// alert(typeof Name)
// alert(typeof isProgrammer)
// alert(typeof age2)
// alert(typeof x)

//5.Приорете операторов.Как в java.
// https://developer.mozilla.org/ru/docs/Web/JavaScript/Reference/Operators/Operator_Precedence

//6.Условные операторы.(if как в java.ернарный оператор тоже есть.)
// == Проверяет по значеню(приводит к общему типу данных).=== Провереят по значению и типу данных(Приоритетный тип)
// const courseStatus = "g"
// if(courseStatus==="ready"){
//  console.log("The curse ready to use")
// }else{
//  console.log("This course is not ready")
// }
//7.Логические операторы.(&&,||,!)
//https://developer.mozilla.org/ru/docs/Web/JavaScript/Guide/Expressions_and_Operators

//8.Функции.
// function calculateAge(year){
//  return 2020-year
// }
// const age = calculateAge(1994)
// alert(age)

//9.Массивы.(Начинается от 0,как в java)
// const cars =["MAzda","Bmw","Ford"]
// const cars = new Array("MAzda","Bmw","Ford")
// cars[0]="Ferrari"
// cars[3]="Toyota"
// alert(cars[3])
// alert(cars.length)

//10.Циклы.(for как в java)
// const cars = ["MAzda", "Bmw", "Ford"]
// for (let i = 0; i < cars.length; i++) {
//     console.log(cars[i])
// }
// for (let car of cars) {
//     console.log(car)
// }

//11.Объекты.
// const person = {
//     firstName: "Yurachel",
//     lastName: "MArsy",
//     year: 1994,
//     languages: ["Ry", "En", "De"],
//     hasWife: true,
//     greet: function (firstName) {
//         console.log(firstName + " is you name")
//     }
// }
// console.log(person.firstName)
// console.log(person["lastName"])
// const key = "year"
// console.log(person[key])
// person.hasWife = false
// person.usProggrammer = true
// console.log(person)
// person.greet("Yurachel")