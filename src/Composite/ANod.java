package Composite;

public abstract class ANod {

    public abstract String getProducator();
    public abstract ETipAutobuz getTip();
    public abstract EGrup getGrup();

    public abstract int getNrLocuri();

    public String getInfo(){
        return " " + this.getProducator() + " - " + this.getTip() + " - " + this.getGrup() + " - locuri: " + this.getNrLocuri();
    }

    public abstract void adaugaNod(ANod nod);

    public abstract void eliminaNod(ANod nod);

    public abstract ANod getNod(int index);

}
