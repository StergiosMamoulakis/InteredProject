package com.example.intered.interedproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtName;
    Button btnPost;
    EditText editTextPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName= (TextView)findViewById(R.id.Name);
        btnPost= (Button)findViewById(R.id.B_post);
        editTextPost= (EditText)findViewById(R.id.editTextPost);


    }
}
