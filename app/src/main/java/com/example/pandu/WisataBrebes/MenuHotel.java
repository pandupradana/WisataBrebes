package com.example.pandu.WisataBrebes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuHotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hotel);

    //menginisiasi dan memanggil widget button pada file layout
        Button buttonhotelgrand = (Button) findViewById(R.id.buttongrand);

        buttonhotelgrand.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuHotel.this,HotelGrand.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonhotelanggraenik = (Button) findViewById(R.id.buttonanggraenik);

        buttonhotelanggraenik.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuHotel.this,HotelAnggraeniK.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonhoteldedy = (Button) findViewById(R.id.buttondedy);

        buttonhoteldedy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuHotel.this,HotelDedy.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonhotelanggraenij = (Button) findViewById(R.id.buttonanggraenij);

        buttonhotelanggraenij.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuHotel.this,HotelAnggraeniJ.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });
    }
}
