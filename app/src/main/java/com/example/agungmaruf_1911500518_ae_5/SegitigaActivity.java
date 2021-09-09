package com.example.agungmaruf_1911500518_ae_5;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class SegitigaActivity extends AppCompatActivity {
    TextInputEditText alas, tinggi, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view) {
        String inputalas = alas.getText().toString().trim();
        String inputtinggi = tinggi.getText().toString().trim();

        if (TextUtils.isEmpty(inputalas)) {
            alas.setError("Sisi alas harus diisi");
            alas.requestFocus();
        } else if (TextUtils.isEmpty(inputtinggi)) {
            tinggi.setError("Tinggi harus diisi");
            tinggi.requestFocus();
        } else {
            Double nilaialas = Double.parseDouble(inputalas);
            Double nilaitinggi = Double.parseDouble(inputtinggi);
            Double hasilhitung = 0.5 * nilaialas * nilaitinggi;
            hasil.setText(hasilhitung.toString());
        }
    }
}