package observer;

/**
 * 登陆观察者 接口
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/11 11 : 01
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
