package EX1;

import java.util.ArrayList;

public class MusicPlayer {
    private String creator;
    private ArrayList<Musica> programacaoMusical;

    public MusicPlayer(String creator, ArrayList<Musica> programacaoMusical) {
        this.creator = creator;
        this.programacaoMusical = programacaoMusical;
    }

    public void adicionarMusica(Musica musica){
        programacaoMusical.add(musica);
    }

    public void removerMusica(Musica musica){
        programacaoMusical.remove(musica);
    }

    public void trocarMusica(int index1, int index2){
        Musica temp = programacaoMusical.get(index1);

        programacaoMusical.set(index1, programacaoMusical.get(index2));
        programacaoMusical.set(index2, temp);
    }

    public void limparProgramacao(){
        programacaoMusical.clear();
    }

    public void imprimirRelatorio(){
        for (Musica music : programacaoMusical){
            int counter = 1;
            System.out.println("Musica " + counter + ": " + music);
            counter++;
        }
    }

    public void duracaoTotal(){
        int totalSeconds = 0;
        for (Musica musica : programacaoMusical) {
            totalSeconds += musica.getDuration();
        }

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Duracao:" + hours + ":" + minutes + ":" + seconds);
    }
}
