// QUALQUER COISA ESTRANHA EU PEDI AO CLAUDE PARA TORNAR AS COISAS MAIS BONITAS E
// GERAR UMA SIMULAÇAO DE TESTE!!! ESTOU À PROCURA DE IDEIAS DE DESIGN PARA O PROJETO FINAL
package EX1;

import EX1.Enums.Alimentacao;
import EX1.Enums.Familia;

public class Men {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                               ║");
        System.out.println("║              🌍 SIMULADOR DE ECOSSISTEMA - VERSÃO 1.0 🌍                      ║");
        System.out.println("║                                                                               ║");
        System.out.println("║                     Desenvolvido para teste académico                        ║");
        System.out.println("║                                                                               ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("\n");

        MeioAmbiente ambiente = new MeioAmbiente("Savana Africana", 100.0);

        System.out.println("🌱 Adicionando flora ao ambiente...");
        Planta arvore = new Planta("Baobá Gigante", "Adansonia digitata", "África", 50, Familia.ARVORES, 3);
        Planta flor = new Planta("Rosa Selvagem", "Rosa rubiginosa", "Portugal", 2, Familia.FLORES, 1);
        Planta erva = new Planta("Capim Dourado", "Poaceae", "Brasil", 1, Familia.ERVAS, 0);
        Planta carnivora = new Planta("Dioneia Assassina", "Dionaea muscipula", "EUA", 3, Familia.COMEINSECTOS, 2);

        ambiente.adicionarSerVivo(arvore);
        ambiente.adicionarSerVivo(flor);
        ambiente.adicionarSerVivo(erva);
        ambiente.adicionarSerVivo(carnivora);

        System.out.println("🦁 Adicionando fauna ao ambiente...");
        Animal leao = new Animal("Simba", "Panthera leo", "África", 5, true, 190.0, 75, Alimentacao.CARNIVORO, "ROARRR!");
        Animal zebra = new Animal("Marty", "Equus quagga", "África", 4, true, 350.0, 45, Alimentacao.HERBIVORO, "Neigh!");
        Animal esquilo = new Animal("Ratatouille", "Sciurus vulgaris", "Europa", 2, true, 0.5, 60, Alimentacao.OMNIVORO, "Squeak!");
        Animal gazela = new Animal("Gracinha", "Gazella", "África", 3, true, 50.0, 55, Alimentacao.HERBIVORO, "Bleat!");

        ambiente.adicionarSerVivo(leao);
        ambiente.adicionarSerVivo(zebra);
        ambiente.adicionarSerVivo(esquilo);
        ambiente.adicionarSerVivo(gazela);

        System.out.println("🐛 Adicionando insetos ao ambiente...");
        Insecto abelha = new Insecto("Zé Abelha", "Apis mellifera", "Portugal", 1, false);
        Insecto vespa = new Insecto("Venenosa Mortal", "Vespula vulgaris", "Europa", 1, true);
        Insecto mosca = new Insecto("Moscardo", "Musca domestica", "Mundial", 1, false);

        ambiente.adicionarSerVivo(abelha);
        ambiente.adicionarSerVivo(vespa);
        ambiente.adicionarSerVivo(mosca);

        System.out.println("\n✅ Ambiente configurado com sucesso!");
        System.out.println("═".repeat(80));

        ambiente.listarSeres();

        System.out.println("\n\n🎬 INICIANDO SIMULAÇÃO DE 5 DIAS...\n");

        ambiente.simulador(5);

        System.out.println("\n\n╔═══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                      SIMULAÇÃO CONCLUÍDA COM SUCESSO                          ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝\n");
    }
}