package Decorator;

public class DecoratorPrintareCraciun extends ADecoratorPrintare{
    public DecoratorPrintareCraciun(APrint print) {
        super(print);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("LA MULTI ANI \n");
    }

}
