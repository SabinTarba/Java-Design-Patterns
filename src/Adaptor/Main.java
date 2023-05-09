package Adaptor;

public class Main {

    public static void main(String[] args) {

        SistemTerestruConcret sistemTerestruConcret = new SistemTerestruConcret();
        sistemTerestruConcret.folosesteBilet();

        try{
            sistemTerestruConcret.setTip(ETipBilet.SUBTERAN);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        ISistemMixt adaptor = new AdaptorSistem();

        adaptor.folosesteBilet(ETipBilet.SUBTERAN);
        adaptor.folosesteBilet(ETipBilet.TERESTRU);
    }
}
