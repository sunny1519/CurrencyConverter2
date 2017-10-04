package com.example.sunnymahipal.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText rupeeAmtEditText = (EditText) findViewById(R.id.rupeeAmtEditText);
        Double rupeeAmtDouble = Double.parseDouble(rupeeAmtEditText.getText().toString());
        Double usDollar = rupeeAmtDouble * 0.016;
        Toast.makeText(this, "$" + usDollar.toString(), Toast.LENGTH_SHORT).show();
        Log.i("Amount",rupeeAmtEditText.getText().toString());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
