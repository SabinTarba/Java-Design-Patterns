package Strategy;

import java.util.List;

public class StrategySMS implements IStrategy{
    @Override
    public void plateste(List<ETipPlata> tipuriPlata) {

        boolean found = false;

        for (ETipPlata tipPlata : tipuriPlata){
            if(tipPlata == ETipPlata.SMS){
                found = true;
                System.out.println("Calatorul plateste prin SMS!");
            }
        }

        if(!found){
            System.out.println("Tipul de plata nu este asociat calatorului! - SMS");
        }
    }
}
