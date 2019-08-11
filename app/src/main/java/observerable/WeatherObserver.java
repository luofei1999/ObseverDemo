package observerable;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

/**
 * ${function}
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/11 11 : 04
 */
public class WeatherObserver implements SubjectObserver {

    private float temperature;
    private float pressure;
    private float humidity;

    private List<Observer> observerList;

    public WeatherObserver() {
        this.observerList = new ArrayList<>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange() {
        notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o :
                observerList) {
            o.update(getTemperature(), getPressure(), getHumidity());
        }
    }

}
