package Memento_Flyweight;


import java.util.ArrayList;
import java.util.List;

public class ManagerVersiuni {

    private List<VersiuneAutobuz> versiuni;

    public ManagerVersiuni() {
        this.versiuni = new ArrayList<>();
    }

    public void adaugaVersiune(VersiuneAutobuz versiuneAutobuz){
        this.versiuni.add(versiuneAutobuz);
    }

    public VersiuneAutobuz recuperareVersiune(int index){
        VersiuneAutobuz versiuneAutobuz = this.versiuni.get(index);
        this.versiuni.remove(index);

        return versiuneAutobuz;
    }
}
