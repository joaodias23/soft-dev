package EX1;

public class Main {
    public static void main(String[] args) {

        Pessoa joao1 = new Pessoa("Joao", 23, 2000);
        Pessoa joao2 = new Pessoa("Joaoao", 24, 3000);

        System.out.println(joao1.getName() + ", " + joao1.getAge() + ", " + joao1.getHeight());

        System.out.println(joao2.getName() + ", " + joao2.getAge() + ", " + joao2.getHeight());
    }
}