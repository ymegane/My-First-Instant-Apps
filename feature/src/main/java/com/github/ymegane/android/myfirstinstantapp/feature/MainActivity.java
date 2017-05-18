package com.github.ymegane.android.myfirstinstantapp.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.ymegane.android.myfirstinstantapp.base.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.something();
    }
}
