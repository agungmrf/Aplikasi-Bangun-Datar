package com.example.agungmaruf_1911500518_ae_5;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class BujurSangkarActivity extends AppCompatActivity {
    TextInputEditText panjangsisi, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bujur_sangkar);
        panjangsisi = findViewById(R.id.panjangsisi);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view) {
        String inputpanjangsisi = panjangsisi.getText().toString().trim();

        if (TextUtils.isEmpty(inputpanjangsisi)) {
            panjangsisi.setError("Panjang sisi harus diisi");
            panjangsisi.requestFocus();
        } else {
            Double nilaipanjangsisi = Double.parseDouble(inputpanjangsisi);
            Double hasilhitung = nilaipanjangsisi * nilaipanjangsisi;
            hasil.setText(hasilhitung.toString());
        }
    }
}