package com.example.intered.interedproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button loginbtn;
    EditText emailText;
    EditText nameText;
    String name;
    String eMailText;
    String checkMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences prefs = getSharedPreferences("save", MODE_PRIVATE);
        checkMe = prefs.getString("check", null);

        if (checkMe.equals("1")) {
            Intent i = new Intent(getBaseContext(), MainActivity.class);
            startActivity(i);
        }

        nameText=(EditText)findViewById(R.id.nametxt);
        emailText=(EditText)findViewById(R.id.emailtxt);

        loginbtn=(Button)findViewById(R.id.button);

        final SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = nameText.getText().toString();
                eMailText = emailText.getText().toString();

                if (name.matches("") || eMailText.matches("") ) {
                    Toast.makeText(Main2Activity.this, "You did not enter a username", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                    editor.putString("name", name);
                    editor.putString("email", eMailText);
                    editor.putString("check", "1");

                    editor.apply();

                    Intent i = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(i);
                }

            }
        });
    }
}
