package EX1;

import EX1.Enums.Familia;

import java.util.ArrayList;
import java.util.Collections;

public class MeioAmbiente {
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>();
    }

    public boolean plantaBebe(int indexPlanta) {
        double aguaDisponivel = this.agua;

        if (!(this.seres.get(indexPlanta) instanceof Planta)) {
            throw new IllegalArgumentException("Não é Planta");
        }

        Planta escolhida = (Planta) this.seres.get(indexPlanta);

        if (escolhida.getFamilia().equals(Familia.ARVORES)) {
            if (aguaDisponivel >= 1) {
                this.agua -= 1;
                System.out.println("Árvore bebe 1L");
                return true;
            } else {
                System.out.println("Não tem água suficiente para a Árvore beber");
                this.seres.remove(escolhida);
                return false;
            }
        } else if (escolhida.getFamilia().equals(Familia.FLORES)) {
            if (aguaDisponivel >= 0.1) {
                this.agua -= 0.1;
                System.out.println("Flor bebe 0.1L");
                return true;
            } else {
                System.out.println("Não tem água suficiente para a Flor beber");
                this.seres.remove(escolhida);
                return false;
            }
        } else if (escolhida.getFamilia().equals(Familia.ERVAS)) {
            if (aguaDisponivel >= 0.25) {
                this.agua -= 0.25;
                System.out.println("Erva bebe 0.25L");
                return true;
            } else {
                System.out.println("Não tem água suficiente para a Erva beber");
                this.seres.remove(escolhida);
                return false;
            }
        }
        return false;
    }

    public boolean plantaComeInsectos(int indexPlanta) {
        if (!(this.seres.get(indexPlanta) instanceof Planta)) {
            throw new IllegalArgumentException("Não é Planta");
        }

        Planta escolhida = (Planta) this.seres.get(indexPlanta);

        if (!escolhida.getFamilia().equals(Familia.COMEINSECTOS)) {
            throw new IllegalArgumentException("Não é Planta comeinsectos");
        }

        Collections.shuffle(this.seres);

        for (SerVivo insecto : seres) {
            if (insecto instanceof Insecto) {
                System.out.println("Planta comeu insecto");
                this.seres.remove(insecto);
                return true;
            } else {
                System.out.println("Não há insectos para a planta comer");
                seres.remove(escolhida);
                return false;
            }
        }

        return false;
    }

    public void plantaAbanaComVento(int indexPlanta) {
        System.out.println("Está muito vento");
    }

    public void animalFazBarulho(int indexAnimal) {
        if (!(this.seres.get(indexAnimal) instanceof Animal)) {
            throw new IllegalArgumentException("Não é Animal");
        }

        Animal animal = (Animal) this.seres.get(indexAnimal);

        System.out.println(animal.getBarulho());
    }

    public void animalMovimenta(int indexAnimal) {
        if (!(this.seres.get(indexAnimal) instanceof Animal)) {
            throw new IllegalArgumentException("Não é Animal");
        }

        Animal animal = (Animal) this.seres.get(indexAnimal);

        System.out.println("O " + animal.getNome() + "movimentou-se");
    }

    public boolean animalBebe(int indexAnimal) {
        double aguaDisponivel = this.agua;

        if (!(this.seres.get(indexAnimal) instanceof Animal)) {
            throw new IllegalArgumentException("Não é Animal");
        }

        Animal escolhido = (Animal) this.seres.get(indexAnimal);

        double aguaNecessaria = escolhido.getPeso() * 0.025;

        if (aguaNecessaria <= this.agua) {
            this.agua -= aguaNecessaria;
            System.out.println("O animal bebe");
            return true;
        } else {
            System.out.println("O animal nao bebe e morre");
            seres.remove(escolhido);
            return false;
        }
    }

    public boolean animalCome
}
