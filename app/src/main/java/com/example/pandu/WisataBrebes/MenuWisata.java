package com.example.pandu.WisataBrebes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuWisata extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_wisata);


        //menginisiasi dan memanggil widget button pada file layout
        Button buttonkaligua = (Button) findViewById(R.id.buttonkaligua);

        buttonkaligua.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuWisata.this,WisataKaligua.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonrandusanga = (Button) findViewById(R.id.buttonrandusanga);

        buttonrandusanga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuWisata.this,WisataRandusanga.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonmangrove = (Button) findViewById(R.id.buttonmangrove);

        buttonmangrove.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuWisata.this,WisataMangrove.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonwaduk = (Button) findViewById(R.id.buttonwaduk);

        buttonwaduk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuWisata.this,WisataWaduk.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

    }
}
