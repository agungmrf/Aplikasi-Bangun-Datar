package com.example.agungmaruf_1911500518_ae_5;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LayangActivity extends AppCompatActivity {
    TextInputEditText diagonal1, diagonal2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang);
        diagonal1 = findViewById(R.id.diagonal1);
        diagonal2 = findViewById(R.id.diagonal2);
        hasil = findViewById(R.id.texthasil);
    }

    public void tombolhitung(View view) {
        String inputdiagonal1 = diagonal1.getText().toString().trim();
        String inputdiagonal2 = diagonal2.getText().toString().trim();

        if (TextUtils.isEmpty(inputdiagonal1)) {
            diagonal1.setError("Diagonal (d1) harus diisi");
            diagonal1.requestFocus();
        } else if (TextUtils.isEmpty(inputdiagonal2)) {
            diagonal2.setError("Diagonal (d2) harus diisi");
            diagonal2.requestFocus();
        } else {
            Double nilaidiagonal1 = Double.parseDouble(inputdiagonal1);
            Double nilaidiagonal2 = Double.parseDouble(inputdiagonal2);
            Double hasilhitung = 0.5 * nilaidiagonal1 * nilaidiagonal2;
            hasil.setText(hasilhitung.toString());
        }
    }
}