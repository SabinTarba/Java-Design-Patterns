package Chain;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Sabin", 4);

        AHandler handlerTroleibuz = new HandlerTroleibuz();
        AHandler handlerTramvai = new HandlerTramvai();
        AHandler handlerAutobuz = new HandlerAutobuz();
        AHandler handlerMetrou = new HandlerMetrou();

        handlerTroleibuz.setNextHandler(handlerTramvai);
        handlerTramvai.setNextHandler(handlerAutobuz);
        handlerAutobuz.setNextHandler(handlerMetrou);

        String mijlocTransport = handlerTroleibuz.procesare(calator);

        System.out.println(mijlocTransport);
    }
}