package Memento_Flyweight;


public class Autobuz {

    private String numeSofer;
    private float consum;
    private DetaliiAutobuz detaliiAutobuz;

    private ManagerVersiuni managerVersiuni;

    public Autobuz(String numeSofer, float consum, ManagerVersiuni managerVersiuni) {
        this.numeSofer = numeSofer;
        this.consum = consum;
        this.managerVersiuni = managerVersiuni;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public float getConsum() {
        return consum;
    }

    public void setConsum(float consum) {
        this.consum = consum;
    }

    public DetaliiAutobuz getDetaliiAutobuz() {
        return detaliiAutobuz;
    }

    public void setDetaliiAutobuz(DetaliiAutobuz detaliiAutobuz) {
        this.detaliiAutobuz = detaliiAutobuz;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consum=" + consum +
                ", detaliiAutobuz=" + detaliiAutobuz +
                '}';
    }

    public void salvareVersiune(){
        this.managerVersiuni.adaugaVersiune(new VersiuneAutobuz(this.numeSofer, this.consum));
    }

    public void recuperareVersiune(int index){
        VersiuneAutobuz versiuneAutobuz = this.managerVersiuni.recuperareVersiune(index);
        this.numeSofer = versiuneAutobuz.getNumeSofer();
        this.consum = versiuneAutobuz.getConsum();
    }
}
