package EX5;

public class Agenda {
    private int yearCreation = 2025;
    private Pessoa[] listContacts;
    private int counter = 0;

    public Agenda(int tamanho) {
        this.listContacts = new Pessoa[tamanho];
    }

    public void addPerson(Pessoa person) {
        listContacts[this.counter] = person;
        this.counter++;
    }

    public void listContacts() {
        System.out.println("\n------------------------------------------------ AGENDA ------------------------------------------------");
        for (int i = 0; i < this.listContacts.length; i++) {
            if(this.listContacts[i] != null){
                this.listContacts[i].exibirDetalhes();
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------\n\n");
    }

    public void searchContacts(String citySearch){
        for (int i = 0; i < this.listContacts.length; i++) {
            if(this.listContacts[i] != null) {
                if (this.listContacts[i].getCity().equalsIgnoreCase(citySearch)) {
                    this.listContacts[i].exibirDetalhes();
                }
            }
        }
    }
}
