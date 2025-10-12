particlesJS("particles-js", {
  particles: {
    number: { value: 80, density: { enable: true, value_area: 800 } },
    color: { value: "#716080" },
    shape: { type: "circle" },
    opacity: { value: 0.4 },
    size: { value: 3, random: true },
    line_linked: { enable: true, distance: 150, color: "#716080", opacity: 0.3, width: 1 },
    move: { enable: true, speed: 1.6, direction: "none", random: false, straight: false, out_mode: "out", bounce: false }
  },
  interactivity: {
    detect_on: "canvas",
    events: { onhover: { enable: true, mode: "repulse" }, onclick: { enable: false }, resize: true },
    modes: { repulse: { distance: 100, duration: 0.4 } }
  },
  retina_detect: true
});

const sections = document.querySelectorAll("#contentWrapper > section");
const navLinks = document.querySelectorAll("#leftnav a");
let currentIndex = 0;
let isScrolling = false;

sections.forEach((sec) => {
  sec.style.position = "absolute";
  sec.style.top = "0";
  sec.style.left = "50%";
  sec.style.transform = "translate(-50%, 100%)";
  sec.style.opacity = "0";
  sec.style.zIndex = "0";
});
sections[currentIndex].style.transform = "translate(-50%, 0)";
sections[currentIndex].style.opacity = "1";
sections[currentIndex].style.zIndex = "1";
updateNavHighlight();

function goToSection(index) {
  if (index === currentIndex || index < 0 || index >= sections.length || isScrolling) return;
  isScrolling = true;

  const current = sections[currentIndex];
  const next = sections[index];
  const direction = index > currentIndex ? "100%" : "-100%";

  navLinks.forEach((link, i) => {
    link.classList.toggle("activeLink", i === index);
  });

  next.style.transition = "none";
  next.style.transform = `translate(-50%, ${direction})`;
  next.style.opacity = "1";
  next.style.zIndex = "1";

  requestAnimationFrame(() => {
    current.style.transition = "transform 0.6s ease, opacity 0.6s ease";
    next.style.transition = "transform 0.6s ease, opacity 0.6s ease";

    current.style.transform = `translate(-50%, ${direction === "100%" ? "-100%" : "100%"})`;
    current.style.opacity = "0";
    next.style.transform = "translate(-50%, 0)";
  });

  setTimeout(() => {
    current.style.transition = "";
    next.style.transition = "";
    current.style.zIndex = "0";
    currentIndex = index;
    isScrolling = false;
  }, 620);
}

window.addEventListener("wheel", (e) => {
  if (e.deltaY > 0) goToSection(currentIndex + 1);
  else if (e.deltaY < 0) goToSection(currentIndex - 1);
});

navLinks.forEach(a => {
  a.addEventListener("click", (e) => {
    e.preventDefault();
    const targetId = a.getAttribute("href").replace("#", "");
    const targetSection = document.getElementById(targetId);
    const index = Array.from(sections).indexOf(targetSection);
    if (index !== -1) goToSection(index);
  });
});

function updateNavHighlight() {
  navLinks.forEach((link, i) => {
    link.classList.toggle("activeLink", i === currentIndex);
  });
}

const githubUsername = "joaodias23";
const projectsGrid = document.getElementById("projectsGrid");

const langColors = {
  "JavaScript": "#f1e05a",
  "Python": "#3572A5",
  "Java": "#b07219",
  "HTML": "#e34c26",
  "CSS": "#563d7c",
  "C": "#555555",
  "React": "#61dafb",
  "Node.js": "#83cd29",
  "SQL": "#e38c00",
  "TypeScript": "#2b7489"
};

fetch(`https://api.github.com/users/${githubUsername}/repos?sort=updated`)
  .then(res => res.json())
  .then(repos => {
    repos.sort((a,b) => b.stargazers_count - a.stargazers_count);

    repos.forEach(repo => {
      if(repo.fork) return;

      const cardLink = document.createElement("a");
      cardLink.href = repo.html_url;
      cardLink.target = "_blank";
      cardLink.className = "project-card";

      const nameDiv = document.createElement("div");
      nameDiv.className = "project-name";
      nameDiv.textContent = repo.name;
      cardLink.appendChild(nameDiv);

      if(repo.description){
        const desc = document.createElement("div");
        desc.className = "project-desc";
        desc.textContent = repo.description;
        cardLink.appendChild(desc);
      }

      if(repo.language){
        const meta = document.createElement("div");
        meta.className = "project-meta";

        const langDiv = document.createElement("div");
        langDiv.className = "project-language";

        const color = document.createElement("span");
        color.className = "color-circle";
        color.style.backgroundColor = langColors[repo.language] || "#ededed";

        const langName = document.createElement("span");
        langName.textContent = repo.language;

        langDiv.appendChild(color);
        langDiv.appendChild(langName);
        meta.appendChild(langDiv);
        cardLink.appendChild(meta);
      }

      projectsGrid.appendChild(cardLink);
    });
  })
  .catch(err => console.error("Error fetching GitHub repos:", err));