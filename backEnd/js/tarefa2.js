const estudantes = [
    {nome: "Bino", nota: 15},
    {nome: "Simão Pumba", nota: 16.7},
    {nome: "Antonio Alves", nota: 12.3},
    {nome: "Jasmin", nota: 14.3},
    {nome: "Algoritmo", nota: 9.8},
    {nome: "Al'alhada", nota: 7.6},
    {nome: "Xing Ji Wuang", nota: 6.1},
    {nome: "Ola", nota: 17.2},
    {nome: "Cima Baixo", nota: 19.5},
    {nome: "Torre", nota: 16.1},
]

function mostrarNome(estudantes){
        estudantes.forEach(function (estudante){
        console.log(estudante.nome);
    });
}

function aprovados(estudantes){
    estudantesAprovados = estudantes.filter(estudante => estudante.nota >= 9.5);
    console.log(estudantesAprovados);
}

function media(estudantes){
    let media = estudantes.reduce( (acumulador, estudante) =>{
        return acumulador + estudante.nota;
    },  0);

    console.log(media / estudantes.length);
}

function gerarLista(estudantes){
    newList = estudantes.map( (estudantes) => `${estudantes.nome} tem a nota ${estudantes.nota}`);
    console.log(newList);
}