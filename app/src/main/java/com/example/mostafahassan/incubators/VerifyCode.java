package com.example.mostafahassan.incubators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VerifyCode extends AppCompatActivity {

    String Admin = "1234", End = "12345";
    Button Confirm;
    EditText VerifyNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        Confirm = (Button) findViewById(R.id.Confirm_Button);
        VerifyNumber = (EditText) findViewById(R.id.Mobile_Number);

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyCode.this, IncubatorsTable.class);
                startActivity(intent);
                //check(VerifyNumber.getText().toString());
            }
        });
    }

//    public void check(String numVerify) {
//        if (numVerify.isEmpty()) {
//            Toast.makeText(this, "Please Insert your Num", Toast.LENGTH_SHORT).show();
//        } else if (numVerify.equals(Admin)) {
//
//            Toast.makeText(this, "Welcome Admin", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(VerifyCode.this, IncubatorsTable.class);
//            startActivity(intent);
//
//        } else if (numVerify.equals(End)) {
//            Toast.makeText(this, "Welcome Enduser", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(VerifyCode.this, IncubatorsTable.class);
//            startActivity(intent);
//        } else {
//            Toast.makeText(this, "You can't login", Toast.LENGTH_SHORT).show();
//        }
//    }
}
