package Chain;

public class Calator {

    private String nume;
    private int nrKm;

    public Calator(String nume, int nrKm) {
        this.nume = nume;
        this.nrKm = nrKm;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrKm() {
        return nrKm;
    }

    public void setNrKm(int nrKm) {
        this.nrKm = nrKm;
    }
}
