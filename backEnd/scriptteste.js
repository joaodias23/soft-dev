// const { createElement } = require("react");

// let tvShowsForm = document.querySelector('#tvshows');

// tvShowsForm.addEventListener('submit', function(e) {
//     e.preventDefault();

//     const formData = new FormData(this);
//     console.log([...formData.entries()]);
// })

let groceryList = document.querySelector('#groceries');
let ul = document.querySelector('#list');

groceryList.addEventListener('submit', function(e) {
    e.preventDefault();

    const formData = new FormData(this);

    const item = document.createElement('li');

    const produto = formData.get('produto');
    const quantidade = formData.get('quantidade');

    item.innerText = `${produto} - ${quantidade}`;
    ul.append(item);

    this.reset();
});

document.getElementById('cat-fact').addEventListener('click', function(e){
    fetch('https://catfact.ninja/fact')
    .then((response) => response.json())
    .then((data) => {
        const p = document.createElement('p');
        p.textContent = data.fact;
        document.body.appendChild(p);
    })
});

document.getElementById('dog-image').addEventListener('click', function(e){
    fetch('https://dog.ceo/api/breeds/image/random')
    .then((response) => response.json())
    .then((data) => {
        const img = document.createElement('img');
        img.src = data.message;
        document.body.appendChild(img);
    })
});

document.getElementById('rick-morty').addEventListener('click', function(e){
    fetch('https://rickandmortyapi.com/api/character')
    .then((response) => response.json())
    .then((data) => {
        const p = document.createElement('p');
        const names = data.results.map(character => character.name).join(', ');
        p.textContent = names;
        p.style.fontSize = '55px';
        document.body.appendChild(p);
    })
});