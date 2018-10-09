package com.daffzzaqihaq.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitigaActivity extends AppCompatActivity {

    EditText edtAlas;
    EditText edtTinggi;
    TextView txtHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        edtAlas = findViewById(R.id.edtAlas);
        edtTinggi = findViewById(R.id.edtTinggi);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer alas = Integer.valueOf(edtAlas.getText().toString());
                Integer tinggi = Integer.valueOf(edtTinggi.getText().toString());

                hitungLuasSegitiga(alas,tinggi,2);

            }
        });

    }

    private void hitungLuasSegitiga(Integer alas, Integer tinggi, int i) {

        int hasil = alas * tinggi / 2;

        txtHasil.setText(String.valueOf(hasil));
    }
}
