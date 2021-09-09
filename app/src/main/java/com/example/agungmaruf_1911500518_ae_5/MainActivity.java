package com.example.agungmaruf_1911500518_ae_5;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panjang(View view) {
        final AlertDialog.Builder panjangalert = new AlertDialog.Builder(MainActivity.this);
        panjangalert.setMessage("Apakah anda yakin ingin menghitung luas Persegi Panjang?");
        panjangalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, PersegiPanjangActivity.class));
            }
        });
        panjangalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        panjangalert.show();
    }

    public void bujursangkar(View view) {
        final AlertDialog.Builder bujursangkaralert = new AlertDialog.Builder(MainActivity.this);
        bujursangkaralert.setMessage("Apakah anda yakin ingin menghitung luas Bujur Sangkar?");
        bujursangkaralert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, BujurSangkarActivity.class));
            }
        });
        bujursangkaralert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        bujursangkaralert.show();
    }

    public void segitiga(View view) {
        final AlertDialog.Builder segitigasalert = new AlertDialog.Builder(MainActivity.this);
        segitigasalert.setMessage("Apakah anda yakin ingin menghitung luas Segitiga?");
        segitigasalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, SegitigaActivity.class));
            }
        });
        segitigasalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        segitigasalert.show();
    }

    public void lingkaran(View view) {
        final AlertDialog.Builder lingkaranalert = new AlertDialog.Builder(MainActivity.this);
        lingkaranalert.setMessage("Apakah anda yakin ingin menghitung luas Lingkaran?");
        lingkaranalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, LingkaranActivity.class));
            }
        });
        lingkaranalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        lingkaranalert.show();
    }

    public void jajargenjang(View view) {
        final AlertDialog.Builder jajargenjangalert = new AlertDialog.Builder(MainActivity.this);
        jajargenjangalert.setMessage("Apakah anda yakin ingin menghitung luas Jajar Genjang?");
        jajargenjangalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, JajarGenjangActivity.class));
            }
        });
        jajargenjangalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        jajargenjangalert.show();
    }

    public void layang(View view) {
        final AlertDialog.Builder layangalert = new AlertDialog.Builder(MainActivity.this);
        layangalert.setMessage("Apakah anda yakin ingin menghitung luas Layang-Layang?");
        layangalert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, LayangActivity.class));
            }
        });
        layangalert.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        layangalert.show();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(MainActivity.this);
        tombolkeluar.setMessage("Apakah anda yakin ingin keluar dari aplikasi ini?");
        tombolkeluar.setTitle("Keluar Aplikasi");
        tombolkeluar.setIcon(R.drawable.alert);
        tombolkeluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        tombolkeluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        tombolkeluar.show();
    }
}