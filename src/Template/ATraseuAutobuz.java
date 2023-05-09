package Template;

public abstract class ATraseuAutobuz {
    public abstract void oprire1();
    public abstract void oprire2();
    public abstract void oprire3();
    public abstract void oprire4();
    public abstract void oprire5();
    public abstract void oprire6();

    public final void traseu(){
        oprire1();
        oprire2();
        oprire3();
        oprire4();
        oprire5();
        oprire6();

        System.out.println("Traseu finalizat!\n");
    }

    public final void traseuInvers(){
        oprire6();
        oprire5();
        oprire4();
        oprire3();
        oprire2();
        oprire1();

        System.out.println("Traseu finalizat [INVERS]!\n");
    }


}
