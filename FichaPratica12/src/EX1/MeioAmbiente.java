package EX1;

import EX1.Enums.Alimentacao;
import EX1.Enums.Familia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class MeioAmbiente {
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>();
    }

    private void printSeparator() {
        System.out.println("═".repeat(80));
    }

    private void printHeader(String title) {
        System.out.println("\n" + "╔" + "═".repeat(78) + "╗");
        System.out.println("║" + centerText(title, 78) + "║");
        System.out.println("╚" + "═".repeat(78) + "╝");
    }

    private String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text + " ".repeat(Math.max(0, width - text.length() - padding));
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
                System.out.println("💧 " + escolhida.getNome() + " bebe 1L de água");
                return true;
            } else {
                System.out.println("💀 Não tem água suficiente para " + escolhida.getNome() + " beber");
                this.seres.remove(escolhida);
                return false;
            }
        } else if (escolhida.getFamilia().equals(Familia.FLORES)) {
            if (aguaDisponivel >= 0.1) {
                this.agua -= 0.1;
                System.out.println("💧 " + escolhida.getNome() + " bebe 0.1L de água");
                return true;
            } else {
                System.out.println("💀 Não tem água suficiente para " + escolhida.getNome() + " beber");
                this.seres.remove(escolhida);
                return false;
            }
        } else if (escolhida.getFamilia().equals(Familia.ERVAS)) {
            if (aguaDisponivel >= 0.25) {
                this.agua -= 0.25;
                System.out.println("💧 " + escolhida.getNome() + " bebe 0.25L de água");
                return true;
            } else {
                System.out.println("💀 Não tem água suficiente para " + escolhida.getNome() + " beber");
                this.seres.remove(escolhida);
                return false;
            }
        }
        return false;
    }

    public boolean plantaComeInsectos(int indexPlanta) {
        if (indexPlanta < 0 || indexPlanta >= this.seres.size()) {
            return false;
        }

        if (!(this.seres.get(indexPlanta) instanceof Planta)) {
            throw new IllegalArgumentException("Não é Planta");
        }

        Planta escolhida = (Planta) this.seres.get(indexPlanta);

        if (!escolhida.getFamilia().equals(Familia.COMEINSECTOS)) {
            throw new IllegalArgumentException("Não é Planta comeinsectos");
        }

        ArrayList<SerVivo> seresShuffled = new ArrayList<>(this.seres);
        Collections.shuffle(seresShuffled);

        for (SerVivo insecto : seresShuffled) {
            if (insecto instanceof Insecto) {
                System.out.println("🪲 " + escolhida.getNome() + " capturou e comeu " + insecto.getNome());
                this.seres.remove(insecto);
                return true;
            }
        }

        System.out.println("⚠️  Não há insectos para " + escolhida.getNome() + " comer - morreu de fome");
        seres.remove(escolhida);
        return false;
    }

    public void plantaAbanaComVento(int indexPlanta) {
        if (indexPlanta >= 0 && indexPlanta < this.seres.size()) {
            Planta planta = (Planta) this.seres.get(indexPlanta);
            System.out.println("🌬️  " + planta.getNome() + " abana com o vento");
        }
    }

    public void animalFazBarulho(int indexAnimal) {
        if (!(this.seres.get(indexAnimal) instanceof Animal)) {
            throw new IllegalArgumentException("Não é Animal");
        }

        Animal animal = (Animal) this.seres.get(indexAnimal);
        System.out.println("🔊 " + animal.getNome() + " faz: " + animal.getBarulho());
    }

    public void animalMovimenta(int indexAnimal) {
        if (!(this.seres.get(indexAnimal) instanceof Animal)) {
            throw new IllegalArgumentException("Não é Animal");
        }

        Animal animal = (Animal) this.seres.get(indexAnimal);
        System.out.println("🏃 " + animal.getNome() + " movimentou-se pelo ambiente");
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
            System.out.println("💧 " + escolhido.getNome() + " bebe " + String.format("%.2f", aguaNecessaria) + "L de água");
            return true;
        } else {
            System.out.println("💀 " + escolhido.getNome() + " não encontrou água suficiente e morreu");
            seres.remove(escolhido);
            return false;
        }
    }

    public boolean animalCome(int indexAnimal){
        if (indexAnimal < 0 || indexAnimal >= this.seres.size()) {
            return false;
        }

        if (!(this.seres.get(indexAnimal) instanceof Animal)) {
            throw new IllegalArgumentException("Não é Animal");
        }

        Animal escolhido = (Animal) this.seres.get(indexAnimal);
        double indexCapacidade = (1 * escolhido.getPeso()) + (2.5 * escolhido.getInteligencia());

        if(escolhido.isFome()){
            if(escolhido.getAlimentacao().equals(Alimentacao.CARNIVORO)){
                SerVivo remover = null;
                ArrayList<SerVivo> seresShuffled = new ArrayList<>(this.seres);
                Collections.shuffle(seresShuffled);

                for (SerVivo animal : seresShuffled){
                    if(animal instanceof Animal && animal != escolhido){
                        double capacidadeRival = (1 * ((Animal) animal).getPeso()) + (2.5 * ((Animal) animal).getInteligencia());
                        if(indexCapacidade > capacidadeRival){
                            System.out.println("⚔️  " + escolhido.getNome() + " vence a luta e devora " + animal.getNome() + "!");
                            remover = animal;
                            break;
                        } else if (indexCapacidade < capacidadeRival){
                            System.out.println("⚔️  " + animal.getNome() + " domina e devora " + escolhido.getNome() + "!");
                            remover = escolhido;
                            break;
                        } else {
                            System.out.println("🤝 Empate! " + escolhido.getNome() + " e " + animal.getNome() + " ficam confusos e comem-se de outra forma");
                            continue;
                        }
                    }
                    if(animal instanceof Insecto){
                        if(((Insecto) animal).isVenenoso()){
                            System.out.println("☠️  " + escolhido.getNome() + " comeu " + animal.getNome() + " venenoso e morreu envenenado!");
                            this.seres.remove(escolhido);
                            return false;
                        } else {
                            System.out.println("🍴 " + escolhido.getNome() + " captura e come " + animal.getNome());
                            remover = animal;
                            break;
                        }
                    }
                }
                if (remover != null) {
                    this.seres.remove(remover);
                    escolhido.setFome(false);
                    return true;
                }
            } else if (escolhido.getAlimentacao().equals(Alimentacao.HERBIVORO)){
                SerVivo remover = null;
                ArrayList<SerVivo> seresShuffled = new ArrayList<>(this.seres);
                Collections.shuffle(seresShuffled);

                for (SerVivo planta : seresShuffled){
                    if (planta instanceof Planta){
                        int inteligenciaAnimal = escolhido.getInteligencia();
                        int defesaPlanta = ((Planta) planta).getGrauDefesa();

                        boolean podeOmer = false;

                        if(inteligenciaAnimal < 20 && defesaPlanta < 1){
                            podeOmer = true;
                        } else if(inteligenciaAnimal >= 20 && inteligenciaAnimal < 40 && defesaPlanta < 2){
                            podeOmer = true;
                        } else if(inteligenciaAnimal >= 40 && inteligenciaAnimal < 60 && defesaPlanta < 3){
                            podeOmer = true;
                        } else if(inteligenciaAnimal >= 60 && inteligenciaAnimal < 80 && defesaPlanta < 4){
                            podeOmer = true;
                        } else if(inteligenciaAnimal >= 80 && inteligenciaAnimal < 95 && defesaPlanta < 5){
                            podeOmer = true;
                        } else if(inteligenciaAnimal >= 95 && inteligenciaAnimal <= 100 && defesaPlanta <= 5){
                            podeOmer = true;
                        }

                        if (podeOmer) {
                            System.out.println("🌿 " + escolhido.getNome() + " alimenta-se de " + planta.getNome());
                            remover = planta;
                            break;
                        }
                    }
                }
                if (remover != null) {
                    this.seres.remove(remover);
                    escolhido.setFome(false);
                    return true;
                } else {
                    System.out.println("😰 " + escolhido.getNome() + " não conseguiu encontrar plantas comestíveis");
                    return false;
                }
            } else if (escolhido.getAlimentacao().equals(Alimentacao.OMNIVORO)){
                System.out.println("\n🐿️  " + escolhido.getNome() + " está faminto e vai comer TUDO!");
                System.out.println("     Este maluco não se importa com veneno, espinhos ou defesas, ele tá-se completamente a cagar!");
                ArrayList<SerVivo> seresShuffled = new ArrayList<>(this.seres);
                Collections.shuffle(seresShuffled);

                for (SerVivo comida : seresShuffled) {
                    if (comida != escolhido && (comida instanceof Planta || comida instanceof Animal || comida instanceof Insecto)) {
                        System.out.println("😋 " + escolhido.getNome() + " devora absolutamente " + comida.getNome() + "!");
                        this.seres.remove(comida);
                        escolhido.setFome(false);
                        return true;
                    }
                }
                return false;
            }
        } else {
            System.out.println("😌 " + escolhido.getNome() + " está satisfeito e descansa");
        }
        return false;
    }

    public void insetoChateia(){
        Random random = new Random();
        String[] barulhos = {"bzzzzzz", "chirp", "click", "whirr", "hum", "hiss", "snap"};
        ArrayList<String> insectoBarulhos = new ArrayList<>();
        int numeroBarulhos = 3;

        for (int i = 0; i < numeroBarulhos; i++) {
            int index = random.nextInt(barulhos.length);
            insectoBarulhos.add(barulhos[index]);
        }

        System.out.println("🦗 Insetos fazem barulho: " + String.join(", ", insectoBarulhos));
    }

    public void adicionarSerVivo(SerVivo serVivo){
        this.seres.add(serVivo);
    }

    public void listarSeres(){
        if (this.seres.isEmpty()){
            System.out.println("\n┌────────────────────────────────────────────┐");
            System.out.println("│   ⚠️  Ambiente vazio - nenhum ser vivo    │");
            System.out.println("└────────────────────────────────────────────┘");
            return;
        }

        System.out.println("\n📋 POPULAÇÃO ATUAL DO AMBIENTE:");
        printSeparator();
        for(SerVivo ser : this.seres){
            System.out.println(ser.toString());
            System.out.println();
        }
        printSeparator();
        System.out.println("Total de seres: " + this.seres.size() + " | 💧 Água disponível: " + String.format("%.2f", this.agua) + "L");
        printSeparator();
    }

    public void simulador(int numeroDias) {
        Random random = new Random();
        SerVivo ultimoMorto = null;

        for (int dia = 1; dia <= numeroDias; dia++) {
            printHeader("DIA " + dia + " - " + this.nome.toUpperCase());

            for (SerVivo ser : this.seres) {
                if (ser instanceof Animal) {
                    ((Animal) ser).setFome(true);
                }
            }
            listarSeres();

            for (int momentoDia = 1; momentoDia <= 3; momentoDia++){
                System.out.println("\n┌─ ⏰ MOMENTO " + momentoDia + " ─────────────────────────────────────┐");
                int classeAgir = random.nextInt(4) + 1;
                ArrayList<Integer> indicesSeres = new ArrayList<>();

                switch (classeAgir) {
                    case 1:
                        for (int i = 0; i < this.seres.size(); i++) {
                            if (this.seres.get(i) instanceof Planta) indicesSeres.add(i);
                        }
                        break;
                    case 2:
                        for (int i = 0; i < this.seres.size(); i++) {
                            if (this.seres.get(i) instanceof Animal) indicesSeres.add(i);
                        }
                        break;
                    case 3:
                        for (int i = 0; i < this.seres.size(); i++) {
                            if (this.seres.get(i) instanceof Insecto) indicesSeres.add(i);
                        }
                        break;
                    case 4:
                        break;
                }

                if (classeAgir == 1 && !indicesSeres.isEmpty()){
                    int indexEscolhido = indicesSeres.get(random.nextInt(indicesSeres.size()));
                    if (indexEscolhido < this.seres.size() && this.seres.get(indexEscolhido) instanceof Planta) {
                        Planta planta = (Planta) this.seres.get(indexEscolhido);
                        int acaoPlanta = random.nextInt(3);
                        switch (acaoPlanta) {
                            case 0 -> this.plantaAbanaComVento(indexEscolhido);
                            case 1 -> this.plantaBebe(indexEscolhido);
                            case 2 -> {
                                if (planta.getFamilia().equals(Familia.COMEINSECTOS)) {
                                    this.plantaComeInsectos(indexEscolhido);
                                } else {
                                    this.plantaAbanaComVento(indexEscolhido);
                                }
                            }
                        }
                    }

                } else if (classeAgir == 2 && !indicesSeres.isEmpty()){
                    int indexEscolhido = indicesSeres.get(random.nextInt(indicesSeres.size()));
                    if (indexEscolhido < this.seres.size() && this.seres.get(indexEscolhido) instanceof Animal) {
                        int acaoAnimal = random.nextInt(4);
                        switch (acaoAnimal) {
                            case 0 -> this.animalFazBarulho(indexEscolhido);
                            case 1 -> this.animalMovimenta(indexEscolhido);
                            case 2 -> this.animalBebe(indexEscolhido);
                            case 3 -> this.animalCome(indexEscolhido);
                        }
                    }

                } else if (classeAgir == 3 && !indicesSeres.isEmpty()){
                    insetoChateia();

                } else if (classeAgir == 4) {
                    int tipoCatastrofe = random.nextInt(3);
                    System.out.println("\n⚠️  ═══ CATÁSTROFE NATURAL ═══ ⚠️");
                    switch (tipoCatastrofe) {
                        case 0 -> {
                            this.agua /= 2;
                            System.out.println("🏜️  SECA EXTREMA! Água reduzida para " + String.format("%.2f", this.agua) + "L");
                        }
                        case 1 -> {
                            this.agua *= 2;
                            System.out.println("🌧️  CHUVAS TORRENCIAIS! Água aumentada para " + String.format("%.2f", this.agua) + "L");
                        }
                        case 2 -> {
                            ArrayList<SerVivo> mortos = new ArrayList<>();
                            for (SerVivo ser : this.seres) {
                                if (ser instanceof Planta || ser instanceof Animal) {
                                    mortos.add(ser);
                                }
                            }
                            Collections.shuffle(mortos);
                            int count = mortos.size() / 2;
                            for (int i = 0; i < count; i++) {
                                ultimoMorto = mortos.get(i);
                                this.seres.remove(mortos.get(i));
                            }
                            System.out.println("🌋 ERUPÇÃO VULCÂNICA! " + count + " seres foram eliminados pela lava!");
                        }
                    }
                }
                System.out.println("└" + "─".repeat(55) + "┘");
            }

            System.out.println("\n🌙 FIM DO DIA - Verificação de sobrevivência...");
            ArrayList<Animal> animaisComFome = new ArrayList<>();
            for (SerVivo ser : this.seres) {
                if (ser instanceof Animal) {
                    Animal animao = (Animal) ser;
                    if (animao.isFome()) {
                        animaisComFome.add(animao);
                    }
                }
            }

            if (!animaisComFome.isEmpty()) {
                System.out.println("⚠️  " + animaisComFome.size() + " animais ainda estão com fome!");
            }

            Iterator<Animal> iterator = animaisComFome.iterator();
            while (iterator.hasNext()) {
                Animal animale = iterator.next();
                int indexAnimal = this.seres.indexOf(animale);
                if (indexAnimal != -1) {
                    boolean conseguiuComer = this.animalCome(indexAnimal);
                    if (!conseguiuComer && this.seres.contains(animale)) {
                        System.out.println("💀 " + animale.getNome() + " não conseguiu alimento e morreu de fome");
                        ultimoMorto = animale;
                        this.seres.remove(animale);
                    }
                }
            }
        }

        printHeader("RESULTADO FINAL DA SIMULAÇÃO");
        if (this.seres.isEmpty()) {
            System.out.println("\n☠️  ═══════════════════════════════════════════════ ☠️");
            System.out.println("     EXTINÇÃO COMPLETA - Todos os seres morreram");
            System.out.println("     Último sobrevivente: " + (ultimoMorto != null ? ultimoMorto.getNome() : "Desconhecido"));
            System.out.println("☠️  ═══════════════════════════════════════════════ ☠️\n");
        } else {
            System.out.println("\n🎉 ═══════════════════════════════════════════════ 🎉");
            System.out.println("     SOBREVIVENTES - " + this.seres.size() + " seres resistiram!");
            System.out.println("🎉 ═══════════════════════════════════════════════ 🎉");
            listarSeres();
        }
    }
}