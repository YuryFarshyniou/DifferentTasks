// const timeout = setTimeout(() => {
//     console.log("After timeout")
// }, 2500)
// const interval = setInterval(()=>{
// console.log("Interval timeout")
// },1000)

// const delay = (callback, wait = 1000) => {
//     setTimeout(callback, wait)
// }
// delay(() => {
//     console.log("After 2 second")
// }, 2000)

// const delay = (wait = 1000) => {
//     const promise = new Promise((resolve, reject) => {
//         setTimeout(() => {
//             reject("Something goes wrong.Try again")
//         }, wait)
//     })
//     return promise
// }
// delay(2500)
//     .then(() => {
//         console.log("After 2 seconds")
//     })
//     .catch(err => console.error("Error", err))
//     .finally(() => console.log("Finally"))

// const getData = () => new Promise(resolve => resolve([
//     1, 1, 2, 3, 4, 8, 13
// ]))
// getData().then(data => console.log(data))
//
// async function asyncExample() {
//     try {
//         await delay(3000)
//         const data = await getData()
//         console.log("Data", data)
//     } catch (e) {
//         console.log(e)
//     }finally {
//         console.log("Finaly")
//     }
// }
//
// asyncExample()
