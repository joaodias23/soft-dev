package EX5;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Quim", 25, "Porto", "quim@gmail.com", 911222333);
        Pessoa pessoa2 = new Pessoa("Ze", 35, "Porto", "ze@gmail.com", 933222111);

        Agenda minhaAgenda = new Agenda (10);

        minhaAgenda.addPerson(pessoa1);
        minhaAgenda.addPerson(pessoa2);

        minhaAgenda.listContacts();

        Pessoa pessoa3 = new Pessoa("Mio", 25, "Porto", "quim@gmail.com", 911222333);
        Pessoa pessoa4 = new Pessoa("Zezolas", 35, "Lisboa", "ze@gmail.com", 933222111);

        minhaAgenda.addPerson(pessoa3);
        minhaAgenda.addPerson(pessoa4);
        minhaAgenda.listContacts();

        minhaAgenda.searchContacts("Porto");
    }
}
