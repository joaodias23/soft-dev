// apanhar elementos do DOM
const cartUl = document.getElementById("cart-items");
const totalSpan = document.getElementById("cart-total");
const addButtons = document.querySelectorAll(".btn-add");
 
let total = 0;
 
function updateTotalDisplay() {
    totalSpan.textContent = `€${total.toFixed(2)}`;
}
 
function addCartItem(name, price) {
    const li = document.createElement("li");
    li.dataset.price = price;
 
    const infoDiv = document.createElement("div");
    infoDiv.classList.add("cart-item-info");
 
    const nameSpan = document.createElement("span");
    nameSpan.classList.add("cart-item-name");
    nameSpan.textContent = name;
 
    const priceSpan = document.createElement("span");
    priceSpan.classList.add("cart-item-price");
    priceSpan.textContent = `€${price.toFixed(2)}`;
 
    infoDiv.appendChild(nameSpan);
    infoDiv.appendChild(priceSpan);
 
    const removeBtn = document.createElement("button");
    removeBtn.classList.add("btn", "btn-remove");
    removeBtn.textContent = "Remover";
 
    removeBtn.addEventListener("click", () => {
        const itemPrice = parseFloat(li.dataset.price) || 0;
        total -= itemPrice;
        updateTotalDisplay();
        li.remove();
    });
 
    li.appendChild(infoDiv);
    li.appendChild(removeBtn);
 
    cartUl.appendChild(li);
 
    total += price;
    updateTotalDisplay();
}
 
addButtons.forEach(btn => {
    btn.addEventListener("click", () => {
        const productCard = btn.closest(".product-card");
 
        const name = productCard.querySelector(".product-name").textContent;
 
        const priceText = productCard.querySelector(".product-price").textContent;
        const price = parseFloat(priceText);
 
        addCartItem(name, price);
    });
});
 
updateTotalDisplay();
 
function myFunction() {
    var element = document.body;
    element.classList.toggle("dark-mode");
}