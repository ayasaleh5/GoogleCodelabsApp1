package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mcount=0;
    private TextView mshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mshow = (TextView)findViewById(R.id.tvcount);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_massage,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        ++mcount;
        if (mshow != null){
            mshow.setText(Integer.toString(mcount));
        }


    }
}
