package Strategy;

import java.util.List;

public class StrategyCardCalatorii implements IStrategy{
    @Override
    public void plateste(List<ETipPlata> tipuriPlata) {

        boolean found = false;

        for (ETipPlata tipPlata : tipuriPlata){
            if(tipPlata == ETipPlata.CARD_CALATORII){
                found = true;
                System.out.println("Calatorul plateste prin CARD CALATORII!");
            }
        }

        if(!found){
            System.out.println("Tipul de plata nu este asociat calatorului! - CARD CALATORII");
        }
    }
}
