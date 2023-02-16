package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRgstClick(View view)
    {
        TextView txtFirst = findViewById(R.id.txt1);
        TextView txtSecond = findViewById(R.id.txt2);
        TextView txtEmail = findViewById(R.id.txt3);

        EditText edtFirstTxt = findViewById(R.id.edtFirst);
        EditText edtSecondTxt = findViewById(R.id.edtSecond);
        EditText edtEmailTxt = findViewById(R.id.edit);


        txtFirst.setText("First Name: " + edtFirstTxt.getText().toString());
        txtSecond.setText("Last Name: " + edtSecondTxt.getText().toString());
        txtEmail.setText("Enail: " + edtEmailTxt.getText().toString());


    }
}