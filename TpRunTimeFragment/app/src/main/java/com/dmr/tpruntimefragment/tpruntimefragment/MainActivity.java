package com.dmr.tpruntimefragment.tpruntimefragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BlankFragment blankFragment = new BlankFragment(); //construction de l'objet de l'instance fragment
         setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,blankFragment).commit();

        //BlankFragment blankFragment = new BlankFragment(); //construction de l'objet de l'instance fragment
        //getSupportFragmentManager().beginTransaction().add(android.R.id.content,blankFragment).commit();

    }

    public void onClickBtnNextFragment(View view){


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack so the user can navigate back
        BlankFragment2 blankFragment2 = new BlankFragment2();
        transaction.replace(R.id.fragment_container, blankFragment2);
        transaction.addToBackStack(null);
// Commit the transaction
        transaction.commit();

    }

    public void onClickBtnAddFragment(View view){


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack so the user can navigate back
        BlankFragment2 blankFragment2 = new BlankFragment2();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,blankFragment2).commit();
        transaction.addToBackStack(null);
// Commit the transaction
        transaction.commit();

    }

    public void clickDoPopBackStack(View v){
        getSupportFragmentManager().popBackStack();
    }
}
