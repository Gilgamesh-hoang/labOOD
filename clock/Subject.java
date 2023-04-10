package observer.clock;

public interface Subject {
    void registerClock(Observer observer);
    void unRegisterClock(Observer observer);
    void notifyObserver();
}
