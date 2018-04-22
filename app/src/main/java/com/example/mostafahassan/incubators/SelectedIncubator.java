package com.example.mostafahassan.incubators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class SelectedIncubator extends AppCompatActivity {
    EditText IncNum, ChileName, Date, Weight, Gender, IdNum;
    Button viewdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_incubator);
        IncNum = (EditText) findViewById(R.id.IncNum_SeleInc);

//        ChileName =(EditText)findViewById(R.id.ChildNam_SeleInc);
//        Date =(EditText)findViewById(R.id.Date_SeleInc);
//        Weight =(EditText)findViewById(R.id.Weight_SeleInc);
//        Gender =(EditText)findViewById(R.id.Gender_SeleInc);
//        IdNum =(EditText)findViewById(R.id.IdNum_SeleInc);

        viewdetail = (Button) findViewById(R.id.ViewDetail);

        viewdetail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectedIncubator.this, ViewDetails.class);

                String name = IncNum.getText().toString();
                intent.putExtra("Inc", name);

                startActivity(intent);
            }
        });
    }
}
