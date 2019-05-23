let button = document.getElementById("button");

button.onclick = function() {
    alert("olá");
}

let fundo = document.getElementById("fundo");

fundo.onclick = function() {
    document.body.style.backgroundColor = "green";
}

let imagem = document.getElementById("imagem");

imagem.onmouseover = function() {
    console.log("Estou vendo a imagem");
}

let imagem2 = document.getElementById("imagem2");

imagem2.onclick = function() {
    console.log("estou clickando na imagem");
}

/*document.querySelector("body").addEventListener("click", function() {
    this.style.background = "red";
}); */

document.getElementById("google").addEventListener("click", function(event) {
    event.preventDefault();
    alert("Não é possivel enviar");
});