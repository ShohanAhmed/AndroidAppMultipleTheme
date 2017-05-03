package com.gg.themetesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ((Button) findViewById(R.id.bRed)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTheme(R.style.AppThemeRed);
                applyCurrentTheme();
            }
        });

        ((Button) findViewById(R.id.bBlue)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTheme(R.style.AppThemeBlue);
                applyCurrentTheme();
            }
        });
    }

    private void applyCurrentTheme() {
        //For change current view on new theme
        setContentView(R.layout.activity_main);
        initView();
    }
}
