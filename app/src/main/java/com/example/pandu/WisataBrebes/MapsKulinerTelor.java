package com.example.pandu.WisataBrebes;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsKulinerTelor extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_kuliner_telor);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng telor1 = new LatLng(-6.868851, 109.031036);
        mMap.addMarker(new MarkerOptions().position(telor1).title("Toko Telor Asin Yes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(telor1, 15));

        // Add a marker in Sydney and move the camera
        LatLng telor2 = new LatLng(-6.868926, 109.031555);
        mMap.addMarker(new MarkerOptions().position(telor2).title("Toko Telor Asin Madu Idolaku"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(telor2, 15));

        // Add a marker in Sydney and move the camera
        LatLng telor3 = new LatLng(-6.870372, 109.038053);
        mMap.addMarker(new MarkerOptions().position(telor3).title("Toko Telor Asin Tjoa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(telor3, 15));
    }
}
