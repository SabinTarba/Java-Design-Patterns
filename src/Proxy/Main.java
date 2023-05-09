package Proxy;

public class Main {

    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz("ABC", 15);

        autobuz.opreste();

        System.out.println("Autobuzul a fost eliberat ...");
        autobuz.elibereazaAutobuz();

        System.out.println("\n[ inainte de proxy ]");
        autobuz.opreste(); // demonstrare ca inainte actiunea nu era restrictionata
        System.out.println("[...]\n");

        IAutobuz proxyAutobuz = new ProxyAutobuz(autobuz);

        proxyAutobuz.opreste();

    }
}
