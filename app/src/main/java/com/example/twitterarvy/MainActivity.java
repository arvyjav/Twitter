package com.example.twitterarvy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText username, password;
     Button masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        username = findViewById( R.id.txtname );
        password = findViewById( R.id.txtpass );
        masuk = findViewById( R.id.btnmasuk );
        masuk.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this, BAKEKOK.class );
                startActivity( i );
                finish();
            }
        } );
    }
}
