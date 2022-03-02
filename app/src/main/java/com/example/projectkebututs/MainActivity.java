package com.example.projectkebututs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPindah = findViewById(R.id.btnpindah);
        Button btnListener = findViewById(R.id.btn_listener_interface);

        //menggunakan anonymous class
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Act2.class);
                startActivity(intent);
                finish();
            }
        });

        //menggunakan layout xml

//        TextView txt2 = findViewById(R.id.nama_bapak);
//        EditText etNama = findViewById(R.id.et_nama);
//        Button btnSubmit = findViewById(R.id.btn_submit);
//
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String nama = etNama.getText().toString();
//                txt2.setText(nama);
//            }
//        });


        //menggunakan listener interface
        btnListener.setOnClickListener(this);

    }
        @Override
        public void onClick (View view){
            String label = ((Button) view).getText().toString();
            Toast.makeText(this, "Anda menekan tombol " +
                    label, Toast.LENGTH_SHORT).show();
        }

    public void pencet(View view) {
        String label = ((Button) view).getText().toString();
        Toast.makeText(this, "Anda Menekan tombol " +
                label, Toast.LENGTH_SHORT).show();
    }
}