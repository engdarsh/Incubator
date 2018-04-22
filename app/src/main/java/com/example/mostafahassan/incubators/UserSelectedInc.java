package com.example.mostafahassan.incubators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class UserSelectedInc extends AppCompatActivity {
    //public TextView IncNum,ChileName,Date,Weight,Gender,IdNum;

    private DatabaseReference mDatabase;
    public TextView Temperature,BodyTemperature, Humidity, Heart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_selected_inc);

        Temperature = (TextView)findViewById(R.id.Temperature);
        BodyTemperature = (TextView)findViewById(R.id.BodyTemperature);
        Humidity = (TextView)findViewById(R.id.Humidity);
        Heart = (TextView)findViewById(R.id.Heart);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Heart");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String HeartValue =dataSnapshot.getValue().toString();
                Heart.setText(HeartValue);
                Log.v("Heart",String.valueOf(Heart));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Temperature");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String TemperatureValue =dataSnapshot.getValue().toString();
                Temperature.setText(TemperatureValue);
                Log.v("Temperature",String.valueOf(Temperature));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mDatabase = FirebaseDatabase.getInstance().getReference().child("BodyTemperature");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String BodyTemperatureValue =dataSnapshot.getValue().toString();
                BodyTemperature.setText(BodyTemperatureValue);
                Log.v("BodyTemperature",String.valueOf(BodyTemperature));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Humidity");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String HumidityValue =dataSnapshot.getValue().toString();
                Humidity.setText(HumidityValue);
                Log.v("Humidity",String.valueOf(Humidity));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


//        IncNum =(TextView)findViewById(R.id.IncNum_UserInc);
//        ChileName =(TextView)findViewById(R.id.ChildNum_UserInc);
//        Date =(TextView)findViewById(R.id.Date_UserInc);
//        Weight =(TextView)findViewById(R.id.Weight_UserInc);
//        Gender =(TextView)findViewById(R.id.Gender_UserInc);
//        IdNum =(TextView)findViewById(R.id.IdNum_UserInc);


        Button viewdetail = (Button) findViewById(R.id.ViewDetail);

        viewdetail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserSelectedInc.this, ViewDetails.class);

                String name = getIntent().getStringExtra("Name");

                startActivity(intent);
            }
        });
    }
}
