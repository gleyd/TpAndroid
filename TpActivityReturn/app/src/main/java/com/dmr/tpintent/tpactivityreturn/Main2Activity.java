package com.dmr.tpintent.tpactivityreturn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = findViewById(R.id.txtName);
    }

    public void clickReturnName(View v){
        String s = txtName.getText().toString();
        Intent i = new Intent();
        i.putExtra("TXT_NAME",s);
        setResult(RESULT_OK,i);
      finish();


    }
}
