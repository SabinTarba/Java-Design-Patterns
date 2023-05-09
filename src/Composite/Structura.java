package Composite;

import java.util.ArrayList;
import java.util.List;

public class Structura extends ANod{
    private String eticheta;

    private List<ANod> noduri;

    public Structura(String eticheta){
        this.eticheta = eticheta;
        this.noduri = new ArrayList<>();
    }


    @Override
    public String getProducator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ETipAutobuz getTip() {
        throw new UnsupportedOperationException();
    }

    @Override
    public EGrup getGrup() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNrLocuri() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void adaugaNod(ANod nod) {
        this.noduri.add(nod);
    }

    @Override
    public void eliminaNod(ANod nod) {
        this.noduri.remove(nod);
    }

    @Override
    public ANod getNod(int index) {
        return this.noduri.get(index);
    }

    @Override
    public String getInfo(){
        String info = "";
        info += " " + this.eticheta + "\n";

        for(ANod nod : noduri){
            info += " " + nod.getInfo() + "\n";
        }

        return info;
    }
}
