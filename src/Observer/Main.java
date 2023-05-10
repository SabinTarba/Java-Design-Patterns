package Observer;

public class Main {

    public static void main(String[] args) {
        IObserver calator1 = new Calator("Sabin");
        IObserver calator2 = new Calator("Ruxi");
        IObserver calator3 = new Calator("Andrei");

        Autobuz autobuz = new Autobuz("Gigel", 5);

        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);

        autobuz.plecareCapatLinie();

        System.out.println("");
        autobuz.elimitaObserver(calator2);
        autobuz.elimitaObserver(calator3);

        autobuz.plecareCapatLinie();
    }
}
