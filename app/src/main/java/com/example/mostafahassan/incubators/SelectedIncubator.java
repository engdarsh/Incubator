package com.example.mostafahassan.incubators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectedIncubator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_incubator);
        Button viewdetail = (Button) findViewById(R.id.ViewDetail);

        viewdetail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectedIncubator.this, ViewDetails.class);
                startActivity(intent);
            }
        });
    }
}
