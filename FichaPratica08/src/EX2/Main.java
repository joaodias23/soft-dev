package EX2;

public class Main {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Top 10 Edificios", "Rua do calhau, 214", "Amarante", "Amarelo Claro", 12, false);

        System.out.println(edificio.getNome() + ";" + edificio.getRua() + ";" + edificio.getCidade() + ";" + edificio.getCorFachada() + ";" + edificio.getAndares() + ";" + edificio.getGaragem());

        edificio.setCorFachada("Vermelho Escuro");

        System.out.println(edificio.getNome() + ";" + edificio.getRua() + ";" + edificio.getCidade() + ";" + edificio.getCorFachada() + ";" + edificio.getAndares() + ";" + edificio.getGaragem());
    }
}
