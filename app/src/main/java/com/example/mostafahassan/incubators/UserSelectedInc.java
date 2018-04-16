package com.example.mostafahassan.incubators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserSelectedInc extends AppCompatActivity {
    public TextView IncNum,ChileName,Date,Weight,Gender,IdNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_selected_inc);

        IncNum =(TextView)findViewById(R.id.IncNum_UserInc);
        ChileName =(TextView)findViewById(R.id.ChildNum_UserInc);
        Date =(TextView)findViewById(R.id.Date_UserInc);
        Weight =(TextView)findViewById(R.id.Weight_UserInc);
        Gender =(TextView)findViewById(R.id.Gender_UserInc);
        IdNum =(TextView)findViewById(R.id.IdNum_UserInc);

        IncNum.getText();

        Button viewdetail = (Button) findViewById(R.id.ViewDetail);

        viewdetail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserSelectedInc.this, ViewDetails.class);

                String name = getIntent().getStringExtra("Name");
                IncNum.setText(name);

                startActivity(intent);
            }
        });
    }
}
