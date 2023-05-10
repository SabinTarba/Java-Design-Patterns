package Observer;

public class Calator implements IObserver {

    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Calatorul " + this.nume + " a primit mesajul: " + mesaj);
    }
}
