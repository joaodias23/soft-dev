package EX2;

public class Jogo {

    public static void main(){

        Personagem persona = new Personagem("Tino", 10, 10, 5, Categoria.CAVALEIRO, "Pistola");

        NPC npc1 = new NPC("Mafarrico", 5, 5, 2, Categoria.MAGO, "Vara");
        NPC npc2 = new NPC("Jagunço", 5, 5, 2, Categoria.MAGO, "Vara");
        NPC npc3 = new NPC("Tone", 5, 5, 2, Categoria.MAGO, "Vara");

        persona.atacar(npc1);
        persona.atacar(npc2);
        persona.atacar(npc3);

        System.out.println(persona.toString());
    }
}
