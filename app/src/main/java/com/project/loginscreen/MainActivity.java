package com.project.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText userName, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.button);
        userName = (EditText) findViewById(R.id.textview);
        pwd = (EditText) findViewById(R.id.textview1);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userNamestr = userName.getText().toString();
                String pwdStr = pwd.getText().toString();
                if (userNamestr.equalsIgnoreCase("kashyap") && pwdStr.equals("rishi")) {
                    // Explict Intent
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    Bundle b = new Bundle();
                    b.putString("key", "1");
                    i.putExtra("user", userNamestr);
                    i.putExtras(b);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}