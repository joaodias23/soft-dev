package EX7;

public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private String curso;
    private double media;

    public Aluno(String nome, int idade, String email, String curso, double media){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
        this.media = media;
    }

    public void exibirDetalhes(){
        System.out.println("------------------------ ALUNO ------------------------");
        System.out.println("{ " + this.nome + " , " + this.idade + " , " + this.email + " , " + this.curso + " , " + this.media + " }");
        System.out.println("-------------------------------------------------------");
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCurso(){
        return this.curso;
    }

    public double getMedia(){
        return this.media;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public void felizAniversario(){
        this.idade += 1;
    }

    public boolean situacaoAprovacao(){
        if(this.media >= 9.5){
            System.out.println("Aprovado");
            return true;
        } else {
            System.out.println("Desaprovado");
            return false;
        }
    }

}
