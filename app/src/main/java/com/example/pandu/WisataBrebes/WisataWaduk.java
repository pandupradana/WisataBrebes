package com.example.pandu.WisataBrebes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class WisataWaduk extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.penjalin1, R.drawable.penjalin2, R.drawable.penjalin3, R.drawable.penjalin4, R.drawable.penjalin5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_waduk);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        //menginisiasi dan memanggil widget button pada file layout
        Button buttonmapswaduk = (Button) findViewById(R.id.buttonmapswaduk);

        buttonmapswaduk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(WisataWaduk.this,MapsWaduk.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

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
