// window.alert("Hello")
//https://developer.mozilla.org/ru/docs/Web/Events
const header = document.getElementById("hello")
// const header2 = document.getElementsByTagName("h2")
// const header2 = document.getElementsByClassName("h2-class")
// const header2 = document.querySelector(".h2-class")
const header2 = document.querySelector("#sub-hello") // Всегда 1 элемент первый попавшийся.
const nodes = document.querySelectorAll("h2")
console.log(nodes)

console.log(header2)


setTimeout(() => {
    addStylesTo(header, "Hello from javaScript", "blue")
}, 1500)

setTimeout(() => {
    addStylesTo(header2.children[0], "Iam learning its right now", "brown", "7rem")
}, 3000)

function addStylesTo(node, text, color = "red", fontsize) {
    node.textContent = text
    node.style.color = color
    node.style.textAlign = "center"
    node.style.padding = "2rem"
    node.style.backgroundColor = "black"
    node.style.display = "block"
    node.style.width = "100%"

    if (fontsize) {
        node.style.fontSize = fontsize
    }
}

header.onclick = () => {
    if (header.style.color === "red") {
        header.style.color = "black"
        header.style.backgroundColor= "white"
    }else{
        header.style.color = "red"
        header.style.backgroundColor= "black"
    }
}
header2.addEventListener("dblclick",()=>{
    if (header2.style.color === "brown") {
        header2.style.color = "black"
        header2.style.backgroundColor= "white"
    }else{
        header2.style.color = "brown"
        header2.style.backgroundColor= "black"
    }
})



