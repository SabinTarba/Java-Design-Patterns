package Memento_Flyweight;


import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<ETipAutobuz, DetaliiAutobuz> evidentaDetaliiAutobuz = new HashMap<>();
    private static int nrInregistrari = 0;

    public static DetaliiAutobuz getDetalii(ETipAutobuz tipAutobuz){
        DetaliiAutobuz detaliiAutobuz = evidentaDetaliiAutobuz.get(tipAutobuz);

        if(detaliiAutobuz == null){
            switch (tipAutobuz){
                case NOU -> {detaliiAutobuz = new DetaliiAutobuz(tipAutobuz, 2019, 50);}
                case VECHI -> {detaliiAutobuz = new DetaliiAutobuz(tipAutobuz, 2001, 33);}
            }

            evidentaDetaliiAutobuz.put(tipAutobuz, detaliiAutobuz);
        } else {
            System.out.println(" --- preluat din memorie --- ");
        }

        return detaliiAutobuz;
    }

    public static int getNrInregistrari(){
        return nrInregistrari;
    }
}
