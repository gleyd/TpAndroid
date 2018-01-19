package com.example.dmr.tphelloworldv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String prenom = intent.getStringExtra("prenom"); //"florent
        TextView textHello = findViewById(R.id.textHello);
        textHello.setText("Bonjour "+ prenom);

    }
}
