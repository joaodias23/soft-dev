const MESSAGE = "  TASTE THE RAINBOW!  ";

const whisper = MESSAGE.trim().toLowerCase();

console.log(whisper);

const word = "skateboard";

const facialHair = word.slice(5).replace('o', 'e');

console.log(word);

console.log(facialHair);

const students = ["Joao", 23, null, "Ola"];

console.log(students[1]);

students[1] = 24;

console.log(students[1]);

console.log(students.length);

const planetas = ["Mercúrio" , "Vénus" , "Terra" , "Mart" , "Jupiter" , "Saturno" , "Urano" , "Neptuno" , "Plutão"];

planetas[3].replace("Mart", "Marte");

planetas.pop();

planetas.unshift("Plutinho");

console.log(planetas);

const airplaneSeats = [
    ['Ruth', 'Anthony', 'Stevie'],
    ['Amelia', 'Pedro', 'Maya'],
    ['Xavier', 'Ananya', 'Luis'],
    ['Luke', null, 'Deniz'],
    ['Rin', 'Sakura', 'Francisco']
];

airplaneSeats[3][1] = "Joao";

console.log(airplaneSeats)

const product = {
    nome : "grandeNome",
    inStock : true,
    price : 1.99,
    Colors : ["vermelho" , "azul" , "verde"],
}

console.log(product.price);
console.log(product.Colors[2]);

product.price = 2.55;
console.log(product.price + " inflação filho")

const people = ["Scooby" , "Velma" , "Daphne" , "Shaggy" , "Fred"];

for (const person of people){
    console.log(person.toUpperCase());
}

const listaCompras = [];

let item;

const codigo = "stop";
const apagar = "apagar";

while (item != codigo) {
    item = prompt("Introduza os itens na lista de compras: ");


    let condicao = `apagar ${item.slice(6).trim()}`

    if (item == apagar){
        listaCompras.pop();
    } else if (item == condicao) {
        for (let thing of listaCompras) {
            if (thing == condicao.slice(6).trim()){
                listaCompras.splice(listaCompras.indexOf(thing), 1);
            }
        }
    } else{
        listaCompras.push(item);
    }
}

listaCompras.pop();

console.log(listaCompras);

let message;

function rant(message){
    message = prompt("Escreve o que queres na tua mensagem:")
    console.log(message);
    console.log(message);
    console.log(message);
}

function isSnakeEyes(num1, num2){
    if (num1 == 1 && num2 == 1){
        console.log("Yay, snake eyes");
    } else {
        console.log("Nao sao olhos de cobra")
    }
}