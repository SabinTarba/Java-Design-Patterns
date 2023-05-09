package Memento;

public class DetaliiAutobuz {

    private ETipAutobuz tipAutobuz;

    private int anFabricatie;

    private int nrLocuri;

    public DetaliiAutobuz(ETipAutobuz tipAutobuz, int anFabricatie, int nrLocuri) {
        this.tipAutobuz = tipAutobuz;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public ETipAutobuz getTipAutobuz() {
        return tipAutobuz;
    }

    public void setTipAutobuz(ETipAutobuz tipAutobuz) {
        this.tipAutobuz = tipAutobuz;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "DetaliiAutobuz{" +
                "tipAutobuz=" + tipAutobuz +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
