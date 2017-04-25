package com.example.a127107.co_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Year> year;
    YearAdapter yearAdapter = null;
    String[] modules = {"C208", "C200", "C346"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.LvCourse);

        // Create a few food objects in Food array
        year = new ArrayList<Year>();
        year.add(new Year("Year 1"));
        year.add(new Year("Year 2"));
        year.add(new Year("Year 3"));



        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new YearAdapter(this, R.layout.firstactivitylistview, year);
        lv.setAdapter(aa);

        yearAdapter = new YearAdapter(this, R.layout.row_1, year);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(),SecondActivity.class);

                if (position == 0){
                    intent.putExtra("year",year.get(0).getYear());
                    intent.putExtra("module", modules[0]);
                } else if (position == 1){
                    intent.putExtra("year",year.get(1).getYear());
                    intent.putExtra("module", modules[1]);
                } else{
                    intent.putExtra("year",year.get(2).getYear());
                    intent.putExtra("module", modules[2]);
                }
                startActivity(intent);

            }
        });

    }
}
