package Decorator;

public abstract class ADecoratorPrintare extends APrint {

    APrint print;

    public ADecoratorPrintare(APrint print) {
        this.print = print;
    }

    @Override
    public void printeaza() {
        print.printeaza();
    }
}
