package Composite;

public class Autogara {

    private String denumire;
    private Structura strucutra;

    public Autogara(String denumire, Structura strucutra) {
        this.denumire = denumire;
        this.strucutra = strucutra;
    }

    public void afiseazaListaInfoAutobuze(){
        System.out.println(this.strucutra.getInfo());
    }
}
