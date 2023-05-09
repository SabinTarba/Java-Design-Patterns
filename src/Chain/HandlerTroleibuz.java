package Chain;

public class HandlerTroleibuz extends AHandler{
    @Override
    public String procesare(Calator calator) {
        if(calator.getNrKm() < 3){
            return "TROLEIBUZ";
        } else if (this.getNextHandler() != null){
            return this.getNextHandler().procesare(calator);
        } else {
            return "error";
        }
    }
}
