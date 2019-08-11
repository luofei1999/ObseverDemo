package observerable;


import observer.EditTextObserver;

/**
 * ${function}
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/11 11 : 42
 */
public interface I_EditTextObserver {
    //注册
    void registerObserver(EditTextObserver i);

    //移除
    void removeObserver(EditTextObserver i);

    //更新数据
    void notifyObserver();

}
