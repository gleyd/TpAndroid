package com.example.dmr.tptoastsnack;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToast(View view){
        //Toast est une fonctionalité de Android
        Toast.makeText(this,"un Toast",Toast.LENGTH_LONG).show(); //this = le MainActibity, souvent le context vise le mainActivity
    }

    public void clickSnack(View view){
        Snackbar.make(view,"Snack !",Snackbar.LENGTH_SHORT).show();
    }

}
