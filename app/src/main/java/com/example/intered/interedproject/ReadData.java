package com.example.intered.interedproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReadData extends AppCompatActivity {

    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_data);

        textView1=(TextView)findViewById(R.id.text);
        textView2=(TextView)findViewById(R.id.name);
    }
}
