package Observer;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements ISubiect {

    private String numeSofer;
    private int nrStatii;

    private List<IObserver> observers;

    public Autobuz(String numeSofer, int nrStatii) {
        this.numeSofer = numeSofer;
        this.nrStatii = nrStatii;
        this.observers = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void elimitaObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAll(String mesaj) {
        for(IObserver observer : this.observers){
            observer.getMesaj(mesaj);
        }
    }

    public void plecareCapatLinie(){
        this.notifyAll("autobuzul cu soferul " + this.numeSofer + " a plecat de la capatul liniei avand un numar de " + this.nrStatii + " statii.");
    }
}
