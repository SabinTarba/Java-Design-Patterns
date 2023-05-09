package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Calator {

    private String nume;
    private List<ETipPlata> tipuriPlati;

    private IStrategy strategie;

    public Calator(String nume){
        this.nume = nume;
        this.tipuriPlati = new ArrayList<>();
    }

    public void adaugaTipPlata(ETipPlata tipPlata){
        this.tipuriPlati.add(tipPlata);
    }

    public void setStrategie(IStrategy strategie){
        this.strategie = strategie;
    }

    public void plateste(){
        this.strategie.plateste(this.tipuriPlati);
    }
}
