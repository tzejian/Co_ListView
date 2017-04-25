package com.example.a127107.co_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 15017167 on 25/4/2017.
 */

public class SecondActivity extends AppCompatActivity {

    ImageView iv;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row_1);

        iv = (ImageView)findViewById(R.id.ivModule);
        tv = (TextView)findViewById(R.id.module);

        Intent intentReceiveModule = getIntent();
        String strMod = intentReceiveModule.getStringExtra("module");
        iv.setImageResource(R.drawable.star);
        tv.setText(strMod);
    }

}
