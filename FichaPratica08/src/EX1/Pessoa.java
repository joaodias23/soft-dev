package EX1;

public class Pessoa {
    private String name = "cyka";
    private int age = 2;
    private int height = 2;

    public Pessoa(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getHeight(){
        return this.height;
    }
}
