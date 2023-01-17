package com.m1mpdam.mybudget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // Categories
    String[] categories = {"Product","Service","Budget Used"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Collect Values from inputs

        //Choose Category
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.category_spinner);
        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter<String> aa = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        //Name
        EditText nameEditText = (EditText) findViewById(R.id.name_txt);
        String name = nameEditText.getText().toString();

        //Cost
        EditText costEditText = (EditText) findViewById(R.id.cost_txt);
        String cost = nameEditText.getText().toString();

        //From Who: Seller
        EditText sellerEditText = (EditText) findViewById(R.id.company_txt);
        String seller = nameEditText.getText().toString();

    }
    public void onSubmit(View view) {
        //Decide what happens when the user clicks the submit button
        Toast.makeText(getApplicationContext(),"Submit", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(getApplicationContext(),"Category: "+categories[position] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {}


}