package EX2;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private String nome;
    private String premio;
    private ArrayList<Pessoa> participantes;

    public Sorteio(String nome, String premio) {
        this.nome = nome;
        this.premio = premio;
        this.participantes = new ArrayList<Pessoa>();
    }

    public void inscreverParticipantes(Pessoa pessoa){
        if(pessoa.getIdade() >= 18){
            participantes.add(pessoa);
            System.out.println("Confirmo a inscrição");
        } else {
            System.out.println("Menor de idade");
        }
    }

    public void sortear(){
        Random rand = new Random();
        int winner = rand.nextInt(participantes.size());
        System.out.println(participantes.get(winner).getNome() + " | " +
                participantes.get(winner).getIdade() + " | " +
                participantes.get(winner).getTelefone() + " | " +
                participantes.get(winner).getEmail());
    }

    public void imprimirParticipantes(){
        int counter = 1;
        for (int i = 0; i < participantes.size(); i++){
            System.out.println("Participante " + (counter) + ": " + participantes.get(i).getNome() + " | " +
                    participantes.get(i).getIdade() + " | " +
                    participantes.get(i).getTelefone() + " | " +
                    participantes.get(i).getEmail());
            counter++;
        }
    }
}
