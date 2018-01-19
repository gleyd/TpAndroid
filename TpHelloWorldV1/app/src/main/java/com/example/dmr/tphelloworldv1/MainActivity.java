package com.example.dmr.tphelloworldv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.wtf(TAG,"OnCreate");

        Button openActivity = (Button)findViewById(R.id.openActivity);
        openActivity.setOnClickListener(new View.OnClickListener(){ //  jajoute un evenement sur le click du boutton  |  je crée un objet qui implement l'interface OnClickListener

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class); //Expéditeur / Destinataire
                startActivity(intent);
            }

         });
        Button openActivity3 = findViewById(R.id.openActivity3);
        Button openActivity4 = findViewById(R.id.openActivity4);

        openActivity3.setOnClickListener(this);
        openActivity4.setOnClickListener(this);

    }



    public void goToActivity2(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class); //Expéditeur / Destinataire
        startActivity(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf(TAG,"OnDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf(TAG,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf(TAG,"OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf(TAG,"OnStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf(TAG,"OnPause");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.openActivity3:
                doClickButton3();
                break;
            case R.id.openActivity4:
                doClickButton4();
                break;
        }
    }

    private void doClickButton4() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class); //Expéditeur / Destinataire
        startActivity(intent);
    }

    private void doClickButton3() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class); //Expéditeur / Destinataire
        startActivity(intent);
    }
}
