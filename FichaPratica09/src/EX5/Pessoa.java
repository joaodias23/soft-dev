package EX5;

public class Pessoa {
    private String name;
    private int age;
    private String city;
    private String email;
    private int phone;

    public Pessoa(String name, int age, String city, String email, int phone) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.email = email;
        this.phone = phone;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ PESSOA ------------------------");
        System.out.println("{ " + this.name + " , " + this.age + " , " + this.city + " , " + this.email + " , " + this.phone + " }");
        System.out.println("-------------------------------------------------------");
    }

    public String getCity() {
        return this.city;
    }
}
