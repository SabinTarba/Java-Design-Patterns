package Adaptor;

public abstract class ASistemTerestru implements ISistemTerestru{

    private ETipBilet tip = ETipBilet.TERESTRU;

    public void setTip(ETipBilet tipBilet){
        if(this instanceof SistemTerestruConcret){
            throw new UnsupportedOperationException("Nu se poate SUBTERAN la sistemul initial care este pentru TERESTRU!");
        } else {
            this.tip = tipBilet;
        }
    }

    @Override
    public void folosesteBilet() {
        System.out.println("Folosire bilet: " + tip);
    }
}
