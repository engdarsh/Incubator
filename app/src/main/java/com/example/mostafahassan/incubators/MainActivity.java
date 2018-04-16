package com.example.mostafahassan.incubators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String Adminpass = "1234", Enduser = "12345";
    Button Confirm;
    EditText MobileNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Confirm = (Button) findViewById(R.id.Confirm_Button);
        MobileNumber = (EditText) findViewById(R.id.Mobile_Number);

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(MobileNumber.getText().toString());
            }
        });
    }

    public void check(String numVerify) {
//        if (numVerify.isEmpty()) {
//            Toast.makeText(this, "Please Insert your Num", Toast.LENGTH_SHORT).show();
//        }

        if (numVerify.equals(Adminpass)) {
            Toast.makeText(this, "Welcome Admin", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, IncubatorsTable.class);
            startActivity(intent);

        } else if (numVerify.equals(Enduser)) {
            Toast.makeText(this, "Welcome Sir", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, UsersIncubators.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "You can't login", Toast.LENGTH_SHORT).show();
        }
    }
}
