package Strategy;

public class Main {

    public static void main(String[] args) {

        Calator calator = new Calator("Sabin");

        calator.adaugaTipPlata(ETipPlata.SMS);
        calator.adaugaTipPlata(ETipPlata.CARD_BANCAR);

        calator.setStrategie(new StrategySMS());
        calator.plateste();

        calator.setStrategie(new StrategyCardCalatorii());
        calator.plateste();

        calator.adaugaTipPlata(ETipPlata.CARD_CALATORII);
        calator.plateste();

    }
}
