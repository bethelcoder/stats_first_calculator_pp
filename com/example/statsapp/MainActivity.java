package com.example.statsapp;

import static com.example.statsapp.Calculator.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ArrayList<Double> numbers = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doAdd(View v){
        EditText e = (EditText)findViewById(R.id.editText1);
        String value = e.getText().toString();
        Double d = Double.parseDouble(value);
        numbers.add(d);
        e.setText("");
    }
    public void doMean(View v){
        double mean = getMean(numbers);
        TextView result = (TextView)findViewById(R.id.output);
        String res = String.valueOf(mean);
        result.setText(res);
    }

    public void doVariance(View v){
        double var = getVariance(numbers);
        TextView result = (TextView)findViewById(R.id.output);
        String res = String.valueOf(var);
        result.setText(res);
    }

    public void doStdDev(View v){
        double std_dev = getStdDev(numbers);
        TextView result = (TextView)findViewById(R.id.output);
        String res = String.valueOf(std_dev);
        result.setText(res);
    }
}