let documento = document.getElementById("titular"); //1
documento.style.display = "none"

let imgCoruja = document.getElementById("lechuza"); //2
imgCoruja.style.filter = "grayscale(100%)"

let input = document.querySelectorAll("input"); //3

for (i = 0; i < input.length; i++) {
    input[i].style.background = "red";
};

console.log(document.querySelector(".fa-twitter").getAttribute("href")); //4 
console.log(document.querySelector(".fa-facebook").getAttribute("href")); //5

document.querySelector(".fa-youtube").setAttribute("href" , "url do youtube"); //6

console.log(document.querySelector(".formulario").hasAttribute("action")); /* hasAttribute verifica se existe a tag e devolver true or false 7 */

let formulario = document.querySelector(".formulario");
formulario.setAttribute("action", formulario.getAttribute("url"));
formulario.removeAttribute("url"); //8

document.querySelectorAll("h2").forEach(function(h2) {
    h2.style.color = "red";
}); //forEach substitui o for 9

document.querySelectorAll(".icon").forEach(function(icon) {
    icon.style.background = "blue";
}); //10

document.getElementById("top").textContent = "topo";
document.getElementById("work").textContent = "trabalho";
document.getElementById("portfolio").textContent = "Portifólio";
document.getElementById("contact").textContent = "Contato"; // 11

let social = document.querySelector(".social");
let forsquare = social.children[3];
social.removeChild(forsquare); //12