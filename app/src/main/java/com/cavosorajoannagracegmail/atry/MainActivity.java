package com.cavosorajoannagracegmail.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etSalary;
    TextView   txtResult;
    Button btnAnalyse;
    Button btnClear;
    TextView txtResult2;
    EditText etPercentage;
    double num;
    double result, result2;
    double num2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSalary = (EditText) findViewById(R.id.etSalary);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnAnalyse = (Button) findViewById(R.id.btnAnalyse);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtResult2 = (TextView) findViewById(R.id.txtResult2);
        etPercentage = (EditText) findViewById(R.id.etPercentage);

        btnAnalyse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = Double.parseDouble(etSalary.getText().toString());
                num2 = Double.parseDouble(etPercentage.getText().toString());


                result= num * num2;
                final String resultString = String.valueOf("Php"+" "+result);
                txtResult.setText(resultString);

                result2 = num - result;
                final String resultString2 = String.valueOf("Php"+" "+result2);
                txtResult2.setText(resultString2);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText("0");
                txtResult2.setText("0");

                num = 0;
                result =0;
                result2 = 0;
            }
        });
    }
}
