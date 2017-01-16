package com.example.student.crudsqlite.UI.UI.Adapters;

/**
 * Created by student on 06.01.2017.
 */


import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

//import com.plyaka.eza.sharedprefcrud.R;
//import com.plyaka.eza.sharedprefcrud.model.Persona;

import com.example.student.crudsqlite.Model.Persona;
import com.example.student.crudsqlite.R;

import java.util.ArrayList;

/**
 * Created by svd on 30.12.16.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Persona> persinList;

    public MyAdapter(Context context, LayoutInflater layoutInflater, ArrayList<Persona> persinList) {
        this.context = context;
        this.layoutInflater = layoutInflater;
        this.persinList = persinList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_person, parent, false);
        }
        final Persona person = (Persona) getItem(position);

        TextView tvNamePerson = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvSurnamePerson = (TextView) convertView.findViewById(R.id.tvLastName);
        TextView tvNumberPerson = (TextView) convertView.findViewById(R.id.tvPhoneNumber);
        TextView tvMailPerson = (TextView) convertView.findViewById(R.id.tvEmail);
        TextView tvSkypePerson = (TextView) convertView.findViewById(R.id.tvSkype);

        tvNamePerson.setText(person.getmName());
        tvSurnamePerson.setText(person.getmLastName());
        tvNumberPerson.setText(person.getmPhoneNumber());
        tvMailPerson.setText(person.getmMail());
        tvSkypePerson.setText(person.getmSkype());

        tvNumberPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: " + person.getmPhoneNumber()));
                if (ActivityCompat.checkSelfPermission( v.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                v.getContext().startActivity(intent);

            }
        });
        tvMailPerson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        tvSkypePerson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });



        return view;
    }


    @Override
    public int getCount() {
        return persinList.size();
    }

    @Override
    public Object getItem(int position) {
        return persinList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
