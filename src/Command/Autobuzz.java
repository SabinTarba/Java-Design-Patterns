package Command;

public class Autobuzz {
    private String numeSofer;
    private String model;

    public Autobuzz(String numeSofer, String model) {
        this.numeSofer = numeSofer;
        this.model = model;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void pleaca(){
        System.out.println("Autobuzul cu modelul " + this.model + " si soferul " + this.numeSofer + " a plecat!");
    }
}
