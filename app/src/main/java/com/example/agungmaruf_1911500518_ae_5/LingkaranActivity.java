package com.example.agungmaruf_1911500518_ae_5;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LingkaranActivity extends AppCompatActivity {
    TextInputEditText jari, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        jari = findViewById(R.id.jarijari);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view) {
        String inputjarijari = jari.getText().toString().trim();

        if (TextUtils.isEmpty(inputjarijari)) {
            jari.setError("Jari-jari harus diisi");
            jari.requestFocus();
            jari.requestFocus();
        } else {
            Double nilaijarijari = Double.parseDouble(inputjarijari);
            Double hasilhitung = 3.14 * nilaijarijari * nilaijarijari;
            hasil.setText(hasilhitung.toString());
        }
    }
}