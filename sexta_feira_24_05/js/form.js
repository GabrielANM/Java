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

document.querySelector("#nome").removeAttribute("type");
document.querySelector("#nome").removeAttribute("required");
document.querySelector("#sobrenome").removeAttribute("type");
document.querySelector("#sobrenome").removeAttribute("required");

function adicionar (id, atributo) {
    document.getElementById(id).createAttribute(atributo);
}

adicionar("nome", "type");

