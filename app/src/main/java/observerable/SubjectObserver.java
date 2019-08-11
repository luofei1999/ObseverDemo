package observerable;

import observer.Observer;

/**
 * ${function}
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/11 11 : 03
 */
public interface SubjectObserver {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
