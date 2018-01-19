package com.example.dmr.tphelloworldv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSend;
    private EditText txtFirstName;
    private final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btnSend = findViewById(R.id.btnSend);
        txtFirstName = findViewById(R.id.txtFirstName);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSend:
                doClickBtnSend();
            break;
        }
    }

    private void doClickBtnSend() {

        String theValuePrenom = txtFirstName.getText().toString();
        Log.i(TAG,theValuePrenom);

        Intent i = new Intent(Main2Activity.this, Main3Activity.class); //Expéditeur / Destinataire
        i.putExtra("prenom",theValuePrenom);
        startActivity(i);

    }
}
