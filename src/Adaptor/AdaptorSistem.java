package Adaptor;

public class AdaptorSistem extends ASistemTerestru implements ISistemMixt{
    @Override
    public void folosesteBilet(ETipBilet tip) {
        this.setTip(tip);
        this.folosesteBilet();
    }
}
