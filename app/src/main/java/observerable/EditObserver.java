package observerable;

import java.util.ArrayList;
import java.util.List;

import observer.EditTextObserver;

/**
 * ${function}
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/11 11 : 43
 */
public class EditObserver implements I_EditTextObserver {

    private String username;
    private String password;
    private List<EditTextObserver> list;

    public EditObserver() {
        this.list = new ArrayList<>();
    }

    public void setData(String username, String password){
        this.username = username;
        this.password = password;
        dataChange();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private void dataChange() {
        notifyObserver();
    }

    @Override
    public void registerObserver(EditTextObserver i) {
        list.add(i);
    }

    @Override
    public void removeObserver(EditTextObserver o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (EditTextObserver o :
                list) {
            o.update(getUsername(),getPassword());
        }
    }
}
