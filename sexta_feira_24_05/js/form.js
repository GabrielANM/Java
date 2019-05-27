let corpo = document.querySelector("body")
let fusao;
let formulario = document.querySelector("form");
formulario.onsubmit = function() {
    if (formulario.nome.value == "" || formulario.sobrenome.value == "") {
        alert("Por favor, indique o seu nome e sobrenome");
        return false;
    }
    if (formulario.senha.value !== formulario.senha2.value) {
        alert("O valor das senhas não é o mesmo");
        return false;
    }
}

let nomeSobrenome = document.querySelector("form");
nomeSobrenome.onsubmit = function() {
    fusao = formulario.nome.value + " " + formulario.sobrenome.value;
    return alert(fusao);
}

let ocultar = document.querySelector("#ocultar");
ocultar.onclick = function() {
    
    let lista ="<ul>"
    for (i = 0; i < formulario.elements.length; i++) {
        if (formulario.elements[i].name != "button") {
            lista += "<li>Nome: " + formulario.elements[i].name + " - Valor: " + formulario.elements[i].value + "</li>";
        }
    }
    lista += "</ul>";

    formulario.innerHTML = lista;
}

document.querySelector(".radio").onclick = function() {
        if (formulario.name.value === "F") {
            document.body.style.background = "black";
        }
        if (formulario.name.value === "M") {
            document.body.style.background = "red";
        }
        /*if (formulario.input.checked == true && formulario.elements[i].id == "radio3") {
            document.body.style.background = "blue";
        } */      
    }