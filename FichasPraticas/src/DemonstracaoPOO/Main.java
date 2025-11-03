package DemonstracaoPOO;

public class Main {
    public static void main(String[] args) {

        Cao rex = new Cao("Rex Maluco");

        System.out.println(rex.nome);
        System.out.println(rex.raca);
        System.out.println(rex.latido);
        System.out.println(rex.idade);

        System.out.println("______________________");

        Cao max = new Cao("Max Maluco","Pinscher","Ai ai ai ",12);

        System.out.println(max.nome);
        System.out.println(max.raca);
        System.out.println(max.latido);
        System.out.println(max.idade);

        System.out.println("______________________");

        Carro fiat = new Carro("Fiat","Uno","Vermelho",TipoCombustivel.DIESEL);
        Carro ferrari = new Carro("Ferrari","SF90","Rosa",TipoCombustivel.GASOLINA);


        fiat.buzinar();

        fiat.setCor("Azul");
        System.out.println(fiat.getMarca());

        ferrari.buzinar();

        fiat.buzinar(5);

    }
}
