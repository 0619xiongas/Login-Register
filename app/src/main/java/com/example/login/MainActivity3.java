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

import java.util.concurrent.Callable;

public class MainActivity3 extends AppCompatActivity {
    private Button Sure;
    private Button Cancel;
    private EditText userName;
    private EditText userPwd1;;
    private void findViews(){
        userName = findViewById(R.id.editTextTextPersonName);
        userPwd1 = findViewById(R.id.editTextTextPassword1);
        Sure = findViewById(R.id.Sure);
        Cancel = findViewById(R.id.button3);
    }
    public void res() {
        String Name = userName.getText().toString().trim();
        String Pwd1 = userPwd1.getText().toString().trim();
        UserR userR = new UserR(MainActivity3.this);
        boolean flag = userR.registerName(Name);
        if (flag == true) {
            Toast.makeText(MainActivity3.this, "该账户名称已被用，请您换一个！",
                    Toast.LENGTH_LONG).show();
        } else {
            UserData userData = new UserData();
            userData.setUserName(Name);
            userData.setUserPwd(Pwd1);
            userR.register(userData);
            Toast.makeText(MainActivity3.this, "注册成功",
                    Toast.LENGTH_LONG).show();
            /*Intent intent = new Intent(MainActivity3.this, MainActivity.class);
            startActivity(intent);*/
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        findViews();
        Sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res();
            }
        });
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}