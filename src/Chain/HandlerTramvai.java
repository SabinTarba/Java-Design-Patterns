package Chain;

public class HandlerTramvai extends AHandler{
    @Override
    public String procesare(Calator calator) {
        if(calator.getNrKm() <= 10 && calator.getNrKm() >= 5){
            return "TRAMVAI";
        } else if (this.getNextHandler() != null){
            return this.getNextHandler().procesare(calator);
        } else {
            return "error";
        }
    }
}
