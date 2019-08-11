package observer;

/**
 * 观察者
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/11 11 : 42
 */
public interface EditTextObserver {
    /**
     * 更新数据
     *
     * @param username 用户名
     * @param password 密码
     */
    void update(String username, String password);
}
