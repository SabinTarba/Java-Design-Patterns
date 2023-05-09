package Memento;

public class VersiuneAutobuz {
    private String numeSofer;
    private float consum;

    public VersiuneAutobuz(String numeSofer, float consum) {
        this.numeSofer = numeSofer;
        this.consum = consum;
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
}
