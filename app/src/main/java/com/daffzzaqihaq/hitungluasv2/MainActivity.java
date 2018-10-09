package com.daffzzaqihaq.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1 Menginisiasi widget ke dalam variable di Java
        Button btnMasuk = findViewById(R.id.btnMasuk);

        //TODO 2 Membuat method onClick
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO 3 Membuat object intent untuk pindah halaman
                Intent pindah = new Intent(MainActivity.this, MenuActivity.class);

                //TODO 4 Lalu kita panggil method startactivity untuk berpindah halaman
                startActivity(pindah);

            }
        });
    }
}
