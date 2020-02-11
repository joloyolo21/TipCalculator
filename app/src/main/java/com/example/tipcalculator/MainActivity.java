package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Bill;
    private EditText Guests;
    private RadioButton fifteen;
    private RadioButton twenty;
    private RadioButton twentyfive;
    private EditText guesttotal;
    private EditText tiptotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bill = findViewById(R.id.Bill);
        Guests = findViewById(R.id.Guests);
        fifteen = findViewById(R.id.fifteen);
        twenty = findViewById(R.id.twenty);
        twentyfive = findViewById(R.id.twentyfive);
        tiptotal = findViewById(R.id.tiptotal);
        guesttotal = findViewById(R.id.guesttotal);
    }

    public void calc(View v) {
        if (fifteen.isChecked()) {
            String input = Bill.getText().toString();
            if (input.length() > 0) {
                double billvalue1 = Double.parseDouble(input);
                double tiptotal1 = (billvalue1*0.15);
                double Bill = (tiptotal1+billvalue1);
                tiptotal.setText(String.format("%.1f", Bill));
                String imp = Guests.getText().toString();
                double guess = Double.parseDouble(imp);
                double Guests = Bill/guess;
                guesttotal.setText(String.format("%.1f", Guests));
            } else {
                Toast.makeText(this, "Hey, we noticed you didn't Enter the bill. Could you do that?", Toast.LENGTH_SHORT).show();
            }
        } else if (twenty.isChecked()) {
            String input = Bill.getText().toString();
            if (input.length() > 0) {
                double billvalue2 = Double.parseDouble(input);
                double tiptotal2 = (billvalue2*0.20);
                double Bill = (tiptotal2 + billvalue2);
                tiptotal.setText(String.format("%.1f", Bill));
                String imp = Guests.getText().toString();
                double guess = Double.parseDouble(imp);
                double Guests = Bill/guess;
                guesttotal.setText(String.format("%.1f", Guests));
            } else {
                Toast.makeText(this, "Hey, we noticed you didn't Enter the bill. Could you do that?", Toast.LENGTH_SHORT).show();
            }
        } else if (twentyfive.isChecked()) {
            String input = Bill.getText().toString();
            if (input.length() > 0) {
                double billvalue3 = Double.parseDouble(input);
                double tiptotal3 = (billvalue3*0.25);
                double Bill = (tiptotal3 + billvalue3);
                tiptotal.setText(String.format("%.1f", Bill));
                String imp = Guests.getText().toString();
                double guess = Double.parseDouble(imp);
                double Guests = Bill/guess;
                guesttotal.setText(String.format("%.1f", Guests));
            } else {
                Toast.makeText(this, "Hey, we noticed you didn't Enter the bill. Could you do that?", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
