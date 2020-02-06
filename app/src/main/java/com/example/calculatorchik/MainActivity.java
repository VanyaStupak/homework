package com.example.calculatorchik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText firstNumber;
EditText secondNumber;
Button Plus;
Button Minus;
Button Multiply;
Button Divide;
TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber= findViewById(R.id.secondNumber);



     View.OnClickListener onClickListener = new View.OnClickListener() {
         @Override
         public void onClick(View v) {

    switch (v.getId()) {
        case R.id.plus:
            result.setText((Integer.parseInt(firstNumber.getText().toString())+(Integer.parseInt(secondNumber.getText().toString()))));
        break;
        case R.id.minus:
            result.setText((Integer.parseInt(firstNumber.getText().toString())-(Integer.parseInt(secondNumber.getText().toString()))));
            break;
        case R.id.multiply:
            result.setText((Integer.parseInt(firstNumber.getText().toString())*(Integer.parseInt(secondNumber.getText().toString()))));
            break;
        case R.id.divide:
            result.setText((Integer.parseInt(firstNumber.getText().toString())*(Integer.parseInt(secondNumber.getText().toString()))));
           break;

    }

}



     };


    }
}
