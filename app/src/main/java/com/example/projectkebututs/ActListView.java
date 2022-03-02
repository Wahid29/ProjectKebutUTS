package com.example.projectkebututs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_list_view);

        //list = nama klas yg buat untuk manggil si array(list_kegiatan) dri layout
        ListView list = findViewById(R.id.list_kegiatan);

        String[] listKegiatan = new String[]{
                "Belanja", "Olahraga", "Tidur", "Main Game", "Pura-pura Ngoding"
        };
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listKegiatan);

        //list :
        list.setAdapter(adapter);
        //namanya harus sesuai dgn nama listview = list
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Toast.makeText(getApplicationContext(), "ID " + position + "\n" + "JUDUL : " + listKegiatan[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}