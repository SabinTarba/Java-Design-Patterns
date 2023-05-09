package Chain;

public class HandlerMetrou extends AHandler {
    @Override
    public String procesare(Calator calator) {

        if(calator.getNrKm() > 10){
            return "METROU";
        } else if (this.getNextHandler() != null){
            return this.getNextHandler().procesare(calator);
        } else {
            return "error";
        }
    }
}
