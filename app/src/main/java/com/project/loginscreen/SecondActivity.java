package com.project.loginscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by acer on 9/25/2017.
 */

public class SecondActivity extends Activity {

    TextView edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.firstactivity);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String val = b.getString("key");
        String value = i.getStringExtra("user");

         edt = (TextView) findViewById(R.id.textview);
        edt.setText("Welcome"+value+",");
    }
}
