package Decorator;

public class PrintareBilet extends APrint{

    private String mesaj;

    public PrintareBilet(String mesaj){
        this.mesaj = mesaj;
    }

    @Override
    public void printeaza() {
        System.out.println(mesaj);
    }
}
