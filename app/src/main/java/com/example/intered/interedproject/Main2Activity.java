package com.example.intered.interedproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    Button loginbtn;
    EditText emailText;
    EditText nameText;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameText=(EditText)findViewById(R.id.nametxt);
        emailText=(EditText)findViewById(R.id.emailtxt);

        loginbtn=(Button)findViewById(R.id.button);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = nameText.getText().toString();

                SharedPreferences.Editor editor = getPreferences(MODE_PRIVATE).edit();
                editor.putString("text",name);
                editor.apply();

            }
        });
    }
}
