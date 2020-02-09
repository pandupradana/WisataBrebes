package com.example.pandu.WisataBrebes;



        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.content.Intent;

public class MainActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //menginisiasi dan memanggil widget button pada file layout
        Button button1 = (Button) findViewById(R.id.buttonwisata);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MainActivityMenu.this,MenuWisata.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button button2 = (Button) findViewById(R.id.buttonhotel);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MainActivityMenu.this,MenuHotel.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button button3 = (Button) findViewById(R.id.buttonkuliner);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MainActivityMenu.this,MenuKuliner.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        //menginisiasi dan memanggil widget button pada file layout
        Button button4 = (Button) findViewById(R.id.buttontentang);

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MainActivityMenu.this,MenuTentang.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

    }


}