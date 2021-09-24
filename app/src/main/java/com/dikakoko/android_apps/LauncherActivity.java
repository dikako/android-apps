package com.dikakoko.android_apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LauncherActivity extends AppCompatActivity {
    EditText nama,kelas;
    TextView hasil;
    Button proses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        nama = findViewById(R.id.nama);
        kelas = findViewById(R.id.kelas);
        hasil = (TextView) findViewById(R.id.hasil);
        proses = findViewById(R.id.proses);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namanya = nama.getEditableText().toString();
                String kelasnya = kelas.getText().toString();
                String hasilnya = namanya + "\n" + kelasnya;
                hasil.setText(hasilnya);
            }
        });
    }
}