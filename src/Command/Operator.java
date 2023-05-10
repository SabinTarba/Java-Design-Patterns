package Command;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Operator {
    private String nume;
    private Map<String, List<IComanda>> comenzi;

    public Operator(String nume){
        this.nume = nume;
        this.comenzi = new HashMap<>();
    }

    public void preiaComanda(String linia, IComanda comanda){

        if(this.comenzi.get(linia) == null){
            this.comenzi.put(linia, new ArrayList<>());
        }

        this.comenzi.get(linia).add(comanda);
    }

    public void transmiteComanda(String linie, IComanda comanda){
        List<IComanda> comenziLinie = this.comenzi.get(linie);
        int index = comenziLinie.indexOf(comanda);
        comenziLinie.get(index).prelucreaza();

        this.comenzi.get(linie).remove(index);
    }
}
