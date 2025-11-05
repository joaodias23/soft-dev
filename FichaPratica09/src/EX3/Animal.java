package EX3;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String [] alimentação;
    private Reino reinoAnimal;

    public Animal(String nome, String especie, String paisOrigem, double peso, String [] alimentação, Reino reinoAnimal){
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentação = alimentação;
        this.reinoAnimal = reinoAnimal;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ ANIMAL ------------------------");
        System.out.println("{ " + this.nome + " , " + this.especie + " , " + this.paisOrigem + " , " + this.peso + " , " + this.reinoAnimal + " }");
        System.out.println("-------------------------------------------------------");
    }

    public void fazerBarulho(){
        if(this.reinoAnimal == Reino.MAMIFERO){
            System.out.println("Tinoninoni");
        } else if(this.reinoAnimal == Reino.ANFIBIO){
            System.out.println("Brrrrrr");
        } else if(this.reinoAnimal == Reino.AVE){
            System.out.println("Kwak Kwak");
        } else if(this.reinoAnimal == Reino.PEIXE){
            System.out.println("Blub Blub Splash");
        } else if(this.reinoAnimal == Reino.REPTIL){
            System.out.println("Pssssss");
        }
    }

    public void comer(String comida, double pesoAlimento){
        boolean flag = false;

        for (int i = 0; i < this.alimentação.length; i++){
            if(comida.equalsIgnoreCase(alimentação[i])){
                this.peso += pesoAlimento / 1000;
                System.out.println("O " + especie + " " + nome + " comeu " + comida);
                this.fazerBarulho();
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("O " + especie + " " + nome + " nao comeu nada");
        }
    }
}
