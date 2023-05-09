package Composite;

import Adaptor.ETipBilet;

public class Main {

    public static void main(String[] args) {
        Structura strucutraAutogara = new Structura("Autogara");
        Autogara autogara = new Autogara("AUTOGARA ASE CTS", strucutraAutogara);

        Structura structuraAutobuzA = new Structura(ETipAutobuz.A.toString());
        Structura structuraAutobuzB = new Structura(ETipAutobuz.B.toString());

        Structura structuraAMic = new Structura(EGrup.MIC.toString());
        Structura structuraAMediu = new Structura(EGrup.MEDIU.toString());
        Structura structuraAMare = new Structura(EGrup.MARE.toString());

        structuraAutobuzA.adaugaNod(structuraAMic);
        structuraAutobuzA.adaugaNod(structuraAMediu);
        structuraAutobuzA.adaugaNod(structuraAMare);

        Structura structuraBMic = new Structura(EGrup.MIC.toString());
        Structura structuraBMediu = new Structura(EGrup.MEDIU.toString());
        Structura structuraBMare = new Structura(EGrup.MARE.toString());

        structuraAutobuzB.adaugaNod(structuraBMic);
        structuraAutobuzB.adaugaNod(structuraBMediu);
        structuraAutobuzB.adaugaNod(structuraBMare);

        structuraAMic.adaugaNod(new Autobuz("A mic", ETipAutobuz.A, EGrup.MIC, 5));
        structuraAMic.adaugaNod(new Autobuz("A mic x2", ETipAutobuz.A, EGrup.MIC, 8));

        structuraAMediu.adaugaNod(new Autobuz("A mediu", ETipAutobuz.A, EGrup.MEDIU, 15));

        structuraBMare.adaugaNod(new Autobuz("B mare", ETipAutobuz.B, EGrup.MARE, 40));

        strucutraAutogara.adaugaNod(structuraAutobuzA);
        structuraAutobuzA.adaugaNod(structuraAutobuzB);

        autogara.afiseazaListaInfoAutobuze();




    }
}
