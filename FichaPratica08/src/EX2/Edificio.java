package EX2;

public class Edificio {
    private String nome;
    private String rua;
    private String cidade;
    private String corFachada; // setter
    private int andares;
    private boolean garagem;

    public Edificio(String nome, String rua, String cidade, String corFachada, int andares, boolean garagem){
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.corFachada = corFachada;
        this.nome = nome;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRua(){
        return this.rua;
    }

    public String getCidade(){
        return this.cidade;
    }

    public String getCorFachada(){
        return this.corFachada;
    }

    public void setCorFachada(String color){
        this.corFachada = color;
    }

    public int getAndares(){
        return this.andares;
    }

    public boolean getGaragem(){
        return this.garagem;
    }
}
