package Command;

public class Main {
    public static void main(String[] args) {
        Autobuzz autobuzz1 = new Autobuzz("Sabin", "ABC");
        Autobuzz autobuzz2 = new Autobuzz("Vlad", "ABC");
        Autobuzz autobuzz3 = new Autobuzz("Maria", "ABC");
        Autobuzz autobuzz4 = new Autobuzz("Gigel", "ABC");

        Operator operator = new Operator("Marius");

        IComanda comanda1 = new ComandaPlecare(autobuzz1);
        IComanda comanda2 = new ComandaPlecare(autobuzz2);
        IComanda comanda3 = new ComandaPlecare(autobuzz3);
        IComanda comanda4 = new ComandaPlecare(autobuzz4);

        operator.preiaComanda("1", comanda1);
        operator.preiaComanda("1", comanda2);
        operator.preiaComanda("2", comanda3);
        operator.preiaComanda("3", comanda4);

        operator.transmiteComanda("1", comanda1);
        operator.transmiteComanda("1", comanda2);
        operator.transmiteComanda("2", comanda3);
        operator.transmiteComanda("3", comanda4);
    }
}
