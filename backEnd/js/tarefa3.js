// ################################################################### LOJA RONÁLDICA ###################################################################

const addButtons = document.querySelectorAll(".add-btn");
const cartItemsDiv = document.getElementById("cart-items");
const cartTotalSpan = document.getElementById("cart-total");
const toggleThemeBtn = document.getElementById("toggle-theme");

let cart = [];
let total = 0;

function addToCart(card) {
    const id = card.dataset.id;
    const name = card.dataset.name;
    const price = parseFloat(card.dataset.price);

    cart.push({ id: id, name: name, price: price });
    total += price;

    card.classList.add("added");
    setTimeout(function() {
        card.classList.remove("added");
    }, 800);

    atualizarCarrinho();
}

function removerItem(index) {
    total -= cart[index].price;
    cart.splice(index, 1);
    atualizarCarrinho();
}

function atualizarCarrinho() {
    cartItemsDiv.innerHTML = "";

    for (let i = 0; i < cart.length; i++) {
        let item = cart[i];

        let div = document.createElement("div");
        div.className = "cart-item";

        div.innerHTML = '<span>' + item.name + ' — €' + item.price.toFixed(2) + '</span>' +
                        '<button class="remove-btn" onclick="removerItem(' + i + ')">Remover</button>';

        cartItemsDiv.appendChild(div);
    }

    cartTotalSpan.textContent = total.toFixed(2);
}

for (let i = 0; i < addButtons.length; i++) {
    addButtons[i].addEventListener("click", function() {
        let card = addButtons[i].closest(".product-card");
        addToCart(card);
    });
}

toggleThemeBtn.addEventListener("click", function() {
    document.body.classList.toggle("dark-mode");
});

// ###################################################################################################################################################

// ################################################################### QUIZ DO PAPAI CRIS ###################################################################

const questions = [
    {
        question: "O que acontece quando Ronaldo diz 'SIIIUUU!'?",
        options: [
            "A gravidade baixa 12%",
            "Os defesas entram em pânico",
            "O estádio inteiro ganha +10 de força",
            "A bola marca golo sozinha"
        ],
        correct: 3
    },
    {
        question: "Qual é o pequeno-almoço oficial do Papai Cris?",
        options: [
            "7 ovos crus e um sorriso",
            "Proteína com mais proteína",
            "Arroz, frango e humildade",
            "Um gole de água mágica e 300 abdominais"
        ],
        correct: 3
    },
    {
        question: "O que faz Ronaldo quando lhe dizem que está velho?",
        options: [
            "Faz 3 golos de bicicleta só para aquecer",
            "Responde 'Calma, calma…'",
            "Liga ao Messi para dar motivação",
            "Corre mais rápido que um carro híbrido"
        ],
        correct: 0
    }
];

let currentQuestion = 0;
let score = 0;

const questionEl = document.getElementById("question");
const optionsEl = document.getElementById("options");
const scoreEl = document.getElementById("score");
const restartBtn = document.getElementById("restart");

function showQuestion() {
    let q = questions[currentQuestion];

    questionEl.textContent = q.question;
    optionsEl.innerHTML = "";

    for (let i = 0; i < q.options.length; i++) {
        let btn = document.createElement("button");
        btn.textContent = q.options[i];
        btn.className = "option";

        btn.addEventListener("click", function() {
            checkAnswer(btn, i);
        });

        optionsEl.appendChild(btn);
    }
}

function checkAnswer(button, index) {
    let q = questions[currentQuestion];

    let allButtons = document.querySelectorAll(".option");
    for (let i = 0; i < allButtons.length; i++) {
        allButtons[i].disabled = true;
    }

    if (index === q.correct) {
        button.style.background = "green";
        score++;
    } else {
        button.style.background = "red";
    }

    setTimeout(function() {
        currentQuestion++;

        if (currentQuestion < questions.length) {
            showQuestion();
        } else {
            showScore();
        }
    }, 1000);
}

function showScore() {
    questionEl.textContent = "Cabou!";
    optionsEl.innerHTML = "";
    scoreEl.textContent = "Pontuação final: " + score + " / " + questions.length;

    restartBtn.style.display = "block";
}

restartBtn.addEventListener("click", function() {
    currentQuestion = 0;
    score = 0;
    scoreEl.textContent = "";
    restartBtn.style.display = "none";
    showQuestion();
});

showQuestion();
