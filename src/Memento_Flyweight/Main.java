package Memento;

public class Main {

    public static void main(String[] args) {
        ManagerVersiuni managerVersiuni = new ManagerVersiuni();

        Autobuz autobuz = new Autobuz("Sabin", 12.4f, managerVersiuni);
        Autobuz autobuz2 = new Autobuz("Tarba", 10.f, null);
        Autobuz autobuz3 = new Autobuz("Andrei", 8.9f, null);

        autobuz.setDetaliiAutobuz(FlyweightFactory.getDetalii(ETipAutobuz.NOU));
        System.out.println(autobuz);

        autobuz2.setDetaliiAutobuz(FlyweightFactory.getDetalii(ETipAutobuz.VECHI));
        System.out.println(autobuz2);

        autobuz3.setDetaliiAutobuz(FlyweightFactory.getDetalii(ETipAutobuz.NOU));
        System.out.println(autobuz3);

        autobuz.salvareVersiune();

        autobuz.setNumeSofer("nume sofer nou");
        autobuz.setConsum(23f);

        System.out.println(autobuz);

        autobuz.recuperareVersiune(0); // revenire la starea initiala - sofer Sabin, consum 12.f

        System.out.println(autobuz);
    }
}
