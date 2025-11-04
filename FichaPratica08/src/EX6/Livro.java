package EX6;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int noPaginas;
    private int identificadorISBN;

    public Livro(String titulo, String autor, String categoria, int noPaginas, int identificadorISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.noPaginas = noPaginas;
        this.identificadorISBN = identificadorISBN;
    }

    public void exibirDetalhes(){
        System.out.println("{ " + this.titulo + " , " + this.autor + " , " + this.categoria + " , " + this.noPaginas + " , " + this.identificadorISBN + " }");
    }

}

