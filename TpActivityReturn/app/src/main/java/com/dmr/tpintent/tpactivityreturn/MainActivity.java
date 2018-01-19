package com.dmr.tpintent.tpactivityreturn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.dmr.tpintent.tpactivityreturn.MyConstants.REQUEST_CODE;

public class MainActivity extends AppCompatActivity {


    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.txtResult);
    }

    public void ClickGoToActivity2(View v){
        Intent i = new Intent(this,Main2Activity.class);
        startActivityForResult(i,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
              String re = data.getStringExtra("TXT_NAME");
              txtResult.setText(re);
            }
        }

    }
}
