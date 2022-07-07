package behavioral.observer_.subject;

import behavioral.observer_.observer.Observer;

/**
 * @author hucc
 * 2022/7/5 22:45
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
