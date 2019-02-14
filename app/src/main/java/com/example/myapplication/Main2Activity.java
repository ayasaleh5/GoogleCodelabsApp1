package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textV = (TextView) findViewById(R.id.textView);

        Bundle b=getIntent().getExtras();
        String user= b.getString("username");
        String pass= b.getString("password");
        textV.setText("user:"+ user + ",pass:" + pass);


    }
}
