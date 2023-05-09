package Chain;

public class HandlerAutobuz extends AHandler {

    @Override
    public String procesare(Calator calator) {

        if(calator.getNrKm() <= 5 && calator.getNrKm() >= 3){
            return "AUTOBUZ";
        } else if (this.getNextHandler() != null){
            return this.getNextHandler().procesare(calator);
        } else {
            return "error";
        }
    }
}
