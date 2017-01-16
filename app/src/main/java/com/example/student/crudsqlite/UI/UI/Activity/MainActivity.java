package com.example.student.crudsqlite.UI.UI.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.student.crudsqlite.DB.CRUDSQLite;
import com.example.student.crudsqlite.Model.Persona;
import com.example.student.crudsqlite.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etId, etName, etLastName, etPhoneNumber, etSkype, etEmail;
    private Button btnSave;
   // private CRUDSharedPref crudSharedPref;
    private CRUDSQLite crudsqLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId = (EditText) findViewById(R.id.etID);
        etName = (EditText) findViewById(R.id.etName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        etSkype = (EditText) findViewById(R.id.etSkype);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPhoneNumber = (EditText) findViewById(R.id.etPhoneNumber);

        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //crudSharedPref = new CRUDSharedPref();
        switch (v.getId())
        {
            case R.id.btnSave:
             Persona personModel = new Persona( Integer.valueOf(etId.getText().toString()), etName.getText().toString(),
                        etLastName.getText().toString(), etPhoneNumber.getText().toString(),
                        etSkype.getText().toString(), etEmail.getText().toString());
               // crudSharedPref.addPerson(this, personModel);

                clearEditText();
                folloeToSecondActivity();

                break;
            default:
                break;
        }
    }

    private  void folloeToSecondActivity()
    {
        //Intent callIntent = new Intent(Intent.ACTION_CALL person.getPhoneNumber().toString());
        // startActivity(callIntent);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        //intent.putExtra("text", String text);
        // intent.get
        startActivity(intent);
    }

    private void clearEditText()
    {
        etId.setText("");;
        etName.setText("");
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.action_settings){
            //followToListActivity();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
