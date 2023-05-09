package Proxy;

public class Autobuz implements IAutobuz{

    private String denumire;
    private int nrPersoaneRamaseAutobuz;

    public Autobuz(String denumire, int nrPersoaneRamaseAutobuz) {
        this.denumire = denumire;
        this.nrPersoaneRamaseAutobuz = nrPersoaneRamaseAutobuz;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNrPersoaneRamaseAutobuz() {
        return nrPersoaneRamaseAutobuz;
    }

    public void setNrPersoaneRamaseAutobuz(int nrPersoaneRamaseAutobuz) {
        this.nrPersoaneRamaseAutobuz = nrPersoaneRamaseAutobuz;
    }

    public void elibereazaAutobuz() {
        this.nrPersoaneRamaseAutobuz = 0;
    }

    @Override
    public void opreste() {
        System.out.println("Autobuzul a oprit ...");
    }
}
