package com.example.intered.interedproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtName;
    Button btnPost;
    EditText editTextPost;
    String name;
    TextView txtEmail;
    String email;
    Button logout;
    Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (TextView) findViewById(R.id.Name);
        btnPost = (Button) findViewById(R.id.B_post);
        editTextPost = (EditText) findViewById(R.id.editTextPost);
        txtEmail = (TextView) findViewById(R.id.emailtxt);
        logout = (Button) findViewById(R.id.logout);
        view = (Button) findViewById(R.id.view);


        SharedPreferences prefs = getSharedPreferences("save", MODE_PRIVATE);
        name = prefs.getString("name", null);
        email = prefs.getString("email", null);


        txtName.setText(name);
        txtEmail.setText(email);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //change the check me value
                SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                editor.putString("check", "0");
                editor.apply();

                //go to main  2 activity
                Intent i = new Intent(getBaseContext(), Main2Activity.class);
                startActivity(i);

            }
        });
    }


    public void onBackPressed() {
        Log.d("CDA", "onBackPressed Called");
        Intent setIntent = new Intent(Intent.ACTION_MAIN);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);
    }
}
