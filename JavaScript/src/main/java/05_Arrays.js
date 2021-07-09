// const cars = ["Mazda", "Ford", "BMW", "Toyota"]
// const people = [
//     {name: "Yurachel", budget: 4200},
//     {name: "Marsy", budget: 3200},
//     {name: "Vica", budget: 1700}
// ]
// const numb = [1, 2, 5, 6, 8, 25, 122, 2, 65]
// const some = [1,2,3,"hello",true]

//Функция.
// function addItemToEnd() {
//
// }

//Метод
// cars.push("Lada")//Добавляет в конец массива
// cars.unshift("Reno") // Добавляет в начало массива.
//
// const firstCar = cars.shift() // Возвращает первый элемент и Удаляет первый элемент массива.
// const lastCar = cars.pop() // Возвращает последний элемент и удаляет его.
//// console.log(cars.reverse())//
// console.log(cars)

// const text = "Hi, we are learning JavaScript"
// const arr = text.split(" ")
// console.log(arr)

// const index = cars.indexOf("BMW")
// cars[index]="Ferrari"
// console.log(cars)

// const index =people.findIndex(function (person){
//     return person.budget===3200
// })
// console.log(index)
// const person =people.find(function (person){
//     return person.budget===3200
// })
// console.log(person)

// let findedPerson
// for (const person of people) {
//     if (person.budget === 1700) {
//         findedPerson = person
//         console.log(findedPerson)
//     }
// }

// const person = people.find(person =>person.budget===1700)
// console.log(person)

// console.log(cars.includes("BMW"))

// const upperCase = cars.map(car=>{
//     return car.toUpperCase()
// })
// console.log(upperCase)

// const filtNumb = numb.filter(num => num>20)
// console.log(filtNumb)

// const allBudget = people
//     .filter(person => person.budget > 2000)
//     .reduce((acc, person) => {
//         acc += person.budget
//         return acc
//     }, 0)
// console.log(allBudget)