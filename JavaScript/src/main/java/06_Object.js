// const person = {
//     name: "Yurachel",
//     age: 26,
//     isProgrammer: true,
//     "complex key": "COmplex value",
//     ["key_" + (1 + 3)]: "Computed value",
//     languages: ["ru", "eng"],
//     greet() {
//         console.log("Greet form person")
//     },
//     info() {
//         console.log("Information to name", this.name)
//     }
//
// }
//
// console.log(person.age)
// console.log(person['name'])
// console.log(person["complex key"])
// console.log(person["key_4"])
// person.greet()
// person.age++
// person.languages.push("by")
// console.log(person)
// // person["key_4"]= undefined
// delete person["key_4"]
// console.log(person)

// const name = person.name
// const age = person.age
// const languages = person.languages

// const{name,age,languages} = person
// console.log(name, age, languages)

// for (let key in person) {
//     if (person.hasOwnProperty(key)) {
//         console.log("key", key)
//         console.log(("value:", person[key]))
//     }
// }

// Object.keys(person).forEach((key)=>{
//         console.log("key", key)
//         console.log(("value:", person[key]))
//     }
// )

// person.info()

// const logger = {
//     keys() {
//         console.log("Object keys: ", Object.keys(this))
//     },
//     keysAndValues(){
//         Object.keys(this).forEach( key =>{
//             console.log(${key} )
//         })
//     }
// }
// const bound = logger.keys.bind(logger)
// bound()
// logger.keys.call(person)
// logger.keysAndValues.call(person)
