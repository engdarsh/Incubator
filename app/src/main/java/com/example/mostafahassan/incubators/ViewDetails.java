package com.example.mostafahassan.incubators;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ViewDetails extends AppCompatActivity {

    private DatabaseReference mDatabase;
    public TextView Temperature,BodyTemperature, Humidity, Heart;
    public TextView Temperature2,BodyTemperature2, Humidity2, Heart2;

    //TextView IncNum,ChileName,Date,Weight,Gender,IdNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details);

        Temperature = (TextView)findViewById(R.id.Temp_ViewDet);
        BodyTemperature = (TextView)findViewById(R.id.BodyTem_ViewDet);
        Humidity = (TextView)findViewById(R.id.Humidity_ViewDet);
        Heart = (TextView)findViewById(R.id.HeartRate_ViewDet);

        Temperature2 = (TextView)findViewById(R.id.Temp_ViewDet2);
        BodyTemperature2 = (TextView)findViewById(R.id.BodyTem_ViewDet2);
        Humidity2 = (TextView)findViewById(R.id.Humidity_ViewDet2);
        Heart2 = (TextView)findViewById(R.id.HeartRate_ViewDet2);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Heart");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String HeartValue =dataSnapshot.getValue().toString();
                Heart.setText(HeartValue);
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
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
            }
        });

        mDatabase = FirebaseDatabase.getInstance().getReference().child("BodyTemperature");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String BodyTemperatureValue =dataSnapshot.getValue().toString();
                BodyTemperature.setText(BodyTemperatureValue);
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
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Heart");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String HeartValue =dataSnapshot.getValue().toString();
                Heart2.setText(HeartValue);
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
                Temperature2.setText(TemperatureValue);
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
                BodyTemperature2.setText(BodyTemperatureValue);
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
                Humidity2.setText(HumidityValue);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

//          IncNum =(TextView)findViewById(R.id.IncNum_UserInc);
//        ChileName =(TextView)findViewById(R.id.ChildNum_UserInc);
//        Date =(TextView)findViewById(R.id.Date_UserInc);
//        Weight =(TextView)findViewById(R.id.Weight_UserInc);
//        Gender =(TextView)findViewById(R.id.Gender_UserInc);
//        IdNum =(TextView)findViewById(R.id.IdNum_UserInc);

    }
}
