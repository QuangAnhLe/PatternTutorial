package example.com.pattern.observer;

import java.util.Observer;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObserver();

}
