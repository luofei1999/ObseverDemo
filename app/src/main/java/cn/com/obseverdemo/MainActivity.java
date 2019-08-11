package cn.com.obseverdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import observer.Login;
import observerable.EditObserver;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    //登录时通知观察者数据更新
    public Button login;
    //展示观察在内容
    public EditText observerContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定控件
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        observerContent = findViewById(R.id.observer_content);

        //被观察者
        EditObserver editTextOb = new EditObserver();
        //初始化观察者
        Login loginObserver = new Login(this);
        //注册观察者
        editTextOb.registerObserver(loginObserver);
        //执行数据的更新，并通知所有的观察者更新数据
        login.setOnClickListener((v)->{
            editTextOb.setData(username.getText().toString(),password.getText().toString());
        });

    }
}
