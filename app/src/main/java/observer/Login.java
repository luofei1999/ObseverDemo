package observer;

import android.util.Log;

import cn.com.obseverdemo.MainActivity;

/**
 * 登陆观察者
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/11 11 : 48
 */
public class Login implements EditTextObserver {

    private String username;
    private String password;
    //主视图的 引用，用来更新 UI
    private MainActivity mainActivity;

    /**
     * 初始化 主视图引用
     * @param mainActivity 主视图引用
     */
    public Login(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    /**
     * 数据更新
     * @param username 用户名
     * @param password 密码
     */
    @Override
    public void update(String username, String password) {
        //保存更新的数据
        this.username = username;
        this.password = password;
        //展示更新的数据
        display();
    }

    /**
     * 数据更新后做出相应的操作
     */
    private void display() {
        String updateMes = username+"---"+password;
        mainActivity.observerContent.setText(updateMes);
    }
}
