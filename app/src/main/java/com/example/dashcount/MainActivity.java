package com.example.dashcount;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//   Hello Rohit
    private Button btn1;
    private Button btn2;
    private TextView textViewtotal;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
    private EditText editText8;
    private EditText editText9;
    private EditText editText10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn11);
        editText1 = findViewById(R.id.editTextNumber1);
        editText2 = findViewById(R.id.editTextNumber2);
        editText3 = findViewById(R.id.editTextNumber3);
        editText4 = findViewById(R.id.editTextNumber4);
        editText5 = findViewById(R.id.editTextNumber5);
        editText6 = findViewById(R.id.editTextNumber6);
        editText7 = findViewById(R.id.editTextNumber7);
        editText8 = findViewById(R.id.editTextNumber8);
        editText9 = findViewById(R.id.editTextNumber9);
        editText10 = findViewById(R.id.editTextNumber10);

        textViewtotal = findViewById(R.id.textView1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = editText1.getText().toString();
                int dashTotal1 = Integer.parseInt(num1);
                int total2000 = 2000 * dashTotal1;

                String num2 = editText2.getText().toString();
                int dashTotal2 = Integer.parseInt(num2);
                int total500 = 500 * dashTotal2;

                String num3 = editText3.getText().toString();
                int dashTotal3 = Integer.parseInt(num3);
                int total200 = 200 * dashTotal3;

                String num4 = editText4.getText().toString();
                int dashTotal4 = Integer.parseInt(num4);
                int total100 = 100 * dashTotal4;

                String num5 = editText5.getText().toString();
                int dashTotal5 = Integer.parseInt(num5);
                int total50 = 50 * dashTotal5;

                String num6 = editText6.getText().toString();
                int dashTotal6 = Integer.parseInt(num6);
                int total20 = 20 * dashTotal6;

                String num7 = editText7.getText().toString();
                int dashTotal7 = Integer.parseInt(num7);
                int total10 = 10 * dashTotal7;

                String num8 = editText8.getText().toString();
                int dashTotal8 = Integer.parseInt(num8);
                int total5 = 5 * dashTotal8;

                String num9 = editText9.getText().toString();
                int dashTotal9 = Integer.parseInt(num9);
                int total2 = 2 * dashTotal9;

                String num10 = editText10.getText().toString();
                int dashTotal10 = Integer.parseInt(num10);
                int total1 = 1 * dashTotal10;

                long theDashTotal = total2000 + total500 + total200 + total100
                        + total50 + total20 + total10 + total5 + total2 + total1;

                textViewtotal.setText("Total : " + theDashTotal);

            }
        });


    }
}