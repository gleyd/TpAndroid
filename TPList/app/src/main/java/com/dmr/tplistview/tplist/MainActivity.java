package com.dmr.tplistview.tplist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         String [] ListPizzas = getResources().getStringArray(R.array.pizzas);
         listView = findViewById(R.id.listItem);
        ArrayAdapter<String> pizzaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListPizzas);
         listView.setAdapter(pizzaAdapter); // la methode setAdapter attend un objet qui implement l'adapteur'
        listView.setOnItemClickListener(this); //car le MainActivity implements l'interface OnItemClickListener
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String s="Hello " + adapterView.getAdapter().getItem(i); // sur l'adapter view passer en paramettre, on si l'adapter qui nous permet dacceder a litem par le get


        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
