package Observer;

public interface ISubiect {
    void adaugaObserver(IObserver observer);
    void elimitaObserver(IObserver observer);
    void notifyAll(String mesaj);
}
