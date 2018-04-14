package com.example.mostafahassan.incubators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IncubatorsTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incubators_table);

        TextView incubator1 = (TextView) findViewById(R.id.incubator1);

        incubator1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IncubatorsTable.this, SelectedIncubator.class);
                startActivity(intent);
            }
        });
        TextView incubator2 = (TextView) findViewById(R.id.incubator2);

        incubator2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IncubatorsTable.this, SelectedIncubator.class);
                startActivity(intent);
            }
        });
        TextView incubator3 = (TextView) findViewById(R.id.incubator3);

        incubator3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IncubatorsTable.this, SelectedIncubator.class);
                startActivity(intent);
            }
        });
        TextView incubator4 = (TextView) findViewById(R.id.incubator4);

        incubator4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IncubatorsTable.this, SelectedIncubator.class);
                startActivity(intent);
            }
        });
    }
}
