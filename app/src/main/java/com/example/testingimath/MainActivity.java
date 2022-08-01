package com.example.testingimath;

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

    public void onClickCalculate(View view){
        EditText inputView = (EditText) findViewById(R.id.editTextNumber);
        TextView outputView = (TextView) findViewById(R.id.textView);

        IMath im = new IMath();
        int input = Integer.valueOf(inputView.getText().toString());
        int output = im.isqrt(input);
        outputView.setText(String.valueOf(output));
    }
}