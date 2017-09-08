package com.example.administrator.jnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.jnilibrary.JniLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textNaitve = (TextView) findViewById(R.id.textNaitve);
        textNaitve.setText(JniLib.getStringFromC());
    }
}
