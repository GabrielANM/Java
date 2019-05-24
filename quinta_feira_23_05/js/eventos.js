let btnHello = document.getElementById("btnHello");
btnHello.addEventListener("click", function(event) {
    console.log(event.clientX);
    console.log(event.clientY);
});


 let button = document.getElementById("button");
let input = document.getElementById("texto");

button.onclick = function() {
    //alert("EU MANDEI NÃO CLICKAR!!!!");
    if (input.style.display == "none") {
        input.style.display = "inline";
    } else {
        input.style.display = "none";
    }
}

input.onkeydown = function(event) {
    let keycode = event.keyCode;
    if (keycode == 13) {
        alert("VOCÊ CLICKOU SEU ANIMAL");
    }

} 

let btnHello = document.getElementById("btnHello");

btnHello.addEventListener("click", function() {
    alert("MANDEI NÃO CLIKAR SEU ANIMAL")
});

document.querySelector("#btnHello").addEventListener("click", function() {
    console.log(this);
});

document.querySelector("body").addEventListener("keypress", function(event) {
    let tecla = event.keyCode;
    if (tecla == 13) {
        alert("Você clickou seu abençoado");
    }
});

let btnHello = document.querySelector("#btnHello");

btnHello.addEventListener("click", function() {
    setTimeout(function() {
        alert("Obrigado por esperar 10 segundos!");
        
    }, 10000);
});
