package com.example.projectkebututs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);

        Spinner spin1 = findViewById(R.id.spin1);
        Button btnAmbil = findViewById(R.id.btn_ambil);
        TextView txtNama = findViewById(R.id.data_nama);

        Button btnnext3 = findViewById(R.id.btnnext2);

        btnnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Act3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //terkait spinner
        List<String> listNama = new ArrayList<String>();
        listNama.add("Curry");
        listNama.add("LeBron");

        String[] arrayBaru = getResources().getStringArray(R.array.nama);

        listNama.addAll(Arrays.asList(arrayBaru));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, listNama);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter);

        //terkait event handler untuk btnAmbil
        btnAmbil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = spin1.getSelectedItem().toString();
                txtNama.setText(nama);

                Toast.makeText(Act3.this, "Anda Mengambil ID : " + spin1.getSelectedItem(),
                Toast.LENGTH_SHORT).show();

//                Toast.makeText(Act3.this, "position : " + spin1.getSelectedItemPosition(),
//                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}