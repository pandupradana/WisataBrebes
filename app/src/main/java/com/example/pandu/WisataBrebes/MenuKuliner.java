package com.example.pandu.WisataBrebes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuKuliner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kuliner);


        //menginisiasi dan memanggil widget button pada file layout
        Button buttonkupat = (Button) findViewById(R.id.buttonkupat);

        buttonkupat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuKuliner.this, KulinerKupat.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonrujak = (Button) findViewById(R.id.buttonrujak);

        buttonrujak.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuKuliner.this, KulinerRujak.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonbakso = (Button) findViewById(R.id.buttonbakso);

        buttonbakso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuKuliner.this, KulinerBakso.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttontelor = (Button) findViewById(R.id.buttontelor);

        buttontelor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuKuliner.this, KulinerTelor.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

    }

}
