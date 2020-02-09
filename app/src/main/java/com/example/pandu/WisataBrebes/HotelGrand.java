package com.example.pandu.WisataBrebes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.net.Uri;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HotelGrand extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.dian1, R.drawable.dian2, R.drawable.dian3, R.drawable.dian4, R.drawable.dian5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_grand);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonmapshotelgrand = (Button) findViewById(R.id.buttonmapshotelgrand);
        buttonmapshotelgrand.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(HotelGrand.this,MapsHotelGrand.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        Button Buttonpesanhotel = (Button) findViewById(R.id.buttonpesanhotel);
        Buttonpesanhotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://granddianhotels.com/gdhbbs/reserve.php"));
                startActivity(intent);
            }
        });
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}
