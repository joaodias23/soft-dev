package EX1;

import java.util.ArrayList;

public class MusicPlayer {
    private String creator;
    private ArrayList<Musica> programacaoMusical;

    public MusicPlayer(String creator) {
        this.creator = creator;
        this.programacaoMusical =  new ArrayList<Musica>();
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
        int counter = 1;
        for (int i = 0; i < programacaoMusical.size(); i++){
            System.out.println("Musica " + (counter) + ": " + programacaoMusical.get(i).getTitle() + " | " +
                    programacaoMusical.get(i).getGenre() + " | " +
                    programacaoMusical.get(i).getArtist() + " | " +
                    programacaoMusical.get(i).getDuration());
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
