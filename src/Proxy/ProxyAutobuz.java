package Proxy;

public class ProxyAutobuz implements IAutobuz{

    private Autobuz autobuz;

    public ProxyAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opreste() {
        if(this.autobuz.getNrPersoaneRamaseAutobuz() != 0){
            this.autobuz.opreste();
        } else {
            System.out.println("Autobuzul nu mai poate opri, pentru ca nu mai sunt persoane in el, deci se va duce la autogara!");
        }
    }
}
