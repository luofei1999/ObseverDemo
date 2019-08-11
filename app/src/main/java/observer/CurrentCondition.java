package observer;

import android.util.Log;

/**
 * ${function}
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/11 11 : 10
 */
public class CurrentCondition implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        Log.d("腾讯------", ""+temperature);
        Log.d("腾讯------", ""+pressure);
        Log.d("腾讯------", ""+humidity);
    }

}
