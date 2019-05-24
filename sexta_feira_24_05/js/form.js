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

function recebeNomeSobrenome(x, y) {
    let nomeSobrenome = x + y;
    console.log(nomeSobrenome);
}

recebeNomeSobrenome(formulario.nome.value, formulario.sobrenome.value);

