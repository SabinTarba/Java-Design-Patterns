package Command;

public class ComandaPlecare implements IComanda {

    private Autobuzz autobuz;

    public ComandaPlecare(Autobuzz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void prelucreaza() {
        this.autobuz.pleaca();
    }
}
