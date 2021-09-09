package com.example.agungmaruf_1911500518_ae_5;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class PersegiPanjangActivity extends AppCompatActivity {
    TextInputEditText panjang, lebar, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view){
        String inputpanjang = panjang.getText().toString().trim();
        String inputlebar = lebar.getText().toString().trim();

        if(TextUtils.isEmpty(inputpanjang)){
            panjang.setError("Panjang harus diisi");
            panjang.requestFocus();
        }else if(TextUtils.isEmpty(inputlebar)){
            lebar.setError("Lebar harus diisi");
            lebar.requestFocus();
        }else {
            Double nilaipanjang = Double.parseDouble(inputpanjang);
            Double nilailebar = Double.parseDouble(inputlebar);
            Double hasilhitung = nilaipanjang * nilailebar;
            hasil.setText(hasilhitung.toString());
        }
    }
}