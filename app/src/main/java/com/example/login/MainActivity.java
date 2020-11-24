package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.login.userData.UserData;
import com.example.login.userData.UserR;

public class MainActivity extends AppCompatActivity {

    private Button mBtnButton;//登录
    private Button mBtnButton2;//注册
    private EditText userName;
    private EditText userPwd;

    //
    public void findViews(){
        mBtnButton = findViewById(R.id.button);
        mBtnButton2 = findViewById(R.id.button2);
        userName = findViewById(R.id.editTextTextPersonName3);
        userPwd  = findViewById(R.id.editTextTextPassword);

        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = userName.getText().toString();
                String Pwd = userPwd.getText().toString();
                UserR userR = new UserR(MainActivity.this);
                boolean flag1 = userR.loginName(Name);
                boolean flag2 = userR.loginPwd(Pwd);

                if(flag1){
                    if(flag2){
                    Toast.makeText(MainActivity.this,"登录成功！",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }else {
                        Toast.makeText(MainActivity.this,"密码或者账户错误！",Toast.LENGTH_LONG).show();
                    }
            }
                else {
                    Toast.makeText(MainActivity.this,"该用户未注册！请注册！",Toast.LENGTH_LONG).show();
                }
            }
        });
        mBtnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

}