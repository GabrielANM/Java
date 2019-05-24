let button = document.getElementById("button");

button.onclick = function() {
    alert("olá");
} //2

let fundo = document.getElementById("fundo");

fundo.onclick = function() {
    document.body.style.backgroundColor = "green";
} //3

let imagem = document.getElementById("imagem");

imagem.onmouseover = function() {
    console.log("Estou vendo a imagem");
} //4

document.getElementById("imagem2").addEventListener("click", function() {
    console.log("estou clickando na imagem");
}); //5

function alterarFundo() {
    this.style.background = "red";
}

document.body.addEventListener("click", alterarFundo); //6

document.body.removeEventListener("click", alterarFundo); //7

document.getElementById("google").addEventListener("click", function(event) {
    event.preventDefault();
    alert("Não é possivel enviar");
}); //8

document.getElementById("imagem2").addEventListener("click", function(event) {
    console.log(event.clientX);
    console.log(event.clientY);
}); //9

// timers

setTimeout(function() {
    alert("tempo esgotado");
}, 10000); //1 

setInterval(function() {
    alert("hora do intervalo");
}, 5000); //2