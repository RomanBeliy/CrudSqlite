package com.example.student.crudsqlite.UI.UI.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.student.crudsqlite.Model.Persona;
import com.example.student.crudsqlite.R;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ListView lvPrerson;
    private ArrayList<Persona> persons;
    //private CRUDSharedPref crudSharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvPrerson = (ListView) findViewById(R.id.list_view_person);
        persons = new ArrayList<>();
        //crudSharedPref = new CRUDSharedPref();
        //persons = crudSharedPref.getPersons(this);

        ArrayAdapter<Persona> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, persons);
        lvPrerson.setAdapter(adapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.action_second_delete_All){
            return true;
        } else if (id == R.id.action_second_delete_person){
            return true;
        } else if (id == R.id.action_second_get_person){
            return true;
        } else if (id == R.id.action_second_update_person){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
