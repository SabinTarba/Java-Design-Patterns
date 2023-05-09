package Chain;

public abstract class AHandler {

    private AHandler handler;

    public void setNextHandler(AHandler handler){
        this.handler = handler;
    }

    public AHandler getNextHandler(){
        return this.handler;
    }

    public abstract String procesare(Calator calator);

}
