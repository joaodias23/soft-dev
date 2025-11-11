// FUNÇAO GERAL

function getRandomInt(max) {
  return Math.floor(Math.random() * max);
}

// FUNÇAO GERAL

// ################################################################### EXERCICIO 1 ###################################################################

const sujeitos = [];
const verbos = [];
const objectos = [];

let frase = [];

function addToArray(){
    let array = prompt("Confirme que tipo de palavra quer adicionar (sujeitos/verbos/objectos):")
    if (array == "sujeitos"){
        let subject = prompt("Adicione um sujeito ao Array:");
        if (subject.slice(-1) == "a"){
            subject = "A " + subject;
        } else if (subject.slice(-1) == "o") {
            subject = "O " + subject;
        }
        sujeitos.push(subject);
    } else if (array == "verbos"){
        let verb = prompt("Adicione um verbo ao Array:");
        verbos.push(verb);
    } else if (array == "objectos"){
        let object = prompt("Adicione um objecto ao Array:");
        if (object.slice(-1) == "a"){
            object = "na " + object;
        } else if (object.slice(-1) == "o") {
            object = "no " + object;
        }
        objectos.push(object);
    }
}

function gerarFrase(){
    frase.push(sujeitos[getRandomInt(sujeitos.length)]); 
    frase.push(verbos[getRandomInt(verbos.length)]);
    frase.push(objectos[getRandomInt(objectos.length)]);
    console.log(frase.join(" "));
    frase = [];
}

// ###################################################################################################################################################

// ################################################################### EXERCICIO 2 ###################################################################

let opcao = 0;
let guess = "";

function generateNumber(){
    while (!(opcao > 0)){ 
        opcao = getRandomInt(20);
    }
}

function guessNumber(){
    while(guess  != opcao){
        guess = prompt("Adivinhe o numero:");
        if(guess < opcao){
            alert("O numero é maior");
        } else if (guess > opcao) {
            alert("O numero é menor");
        } else {
            alert("ACERTOU");
        }
    }
}

// ###################################################################################################################################################

// ################################################################### EXERCICIO 2 ###################################################################

const characters = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"];

const numbers = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"];

const symbols = ["!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+",
                "[", "]", "{", "}", ";", ":", "'", '"', "\\", "|", ",", ".", "<", ">", "/", "?"];

let password = [];

let comprimento = 0;
let counter = 0;

function gerarPassword(){
    comprimento = prompt("Defina o comprimento da sua password com um numero:");

    while(counter != comprimento){
        password.push(characters[getRandomInt(characters.length)]) &&
        password.push(numbers[getRandomInt(numbers.length)]) &&
        password.push(symbols[getRandomInt(symbols.length)]);
        counter++;
    }
    
    console.log(password.join(""));
    password = [];
}

// ###################################################################################################################################################