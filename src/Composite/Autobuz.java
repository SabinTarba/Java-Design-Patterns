package Composite;

public class Autobuz extends ANod{

    private String producator;
    private ETipAutobuz tip;
    private EGrup grup;
    private int nrLocuri;

    public Autobuz(String producator, ETipAutobuz tip, EGrup grup, int nrLocuri) {
        this.producator = producator;
        this.tip = tip;
        this.grup = grup;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String getProducator() {
        return this.producator;
    }

    @Override
    public ETipAutobuz getTip() {
        return this.tip;
    }

    @Override
    public EGrup getGrup() {
        return this.grup;
    }

    @Override
    public int getNrLocuri() {
        return this.nrLocuri;
    }

    @Override
    public void adaugaNod(ANod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void eliminaNod(ANod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ANod getNod(int index) {
        throw new UnsupportedOperationException();
    }
}
