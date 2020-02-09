package com.example.pandu.WisataBrebes;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsKulinerKupat extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_kuliner_kupat);
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
        LatLng kupat1 = new LatLng(-6.869894, 109.036947);
        mMap.addMarker(new MarkerOptions().position(kupat1).title("Pondok Kupat Sate Blengong “Om Sabar”"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kupat1, 15));

        LatLng kupat2 = new LatLng(-6.871163, 109.037290);
        mMap.addMarker(new MarkerOptions().position(kupat2).title("Kupat Sate Blengong Mbak Tuti"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kupat2, 15));

        LatLng kupat3 = new LatLng(-6.874802, 109.056735);
        mMap.addMarker(new MarkerOptions().position(kupat3).title("Warung Makan Sate Blengong Bu Kijah Brebes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kupat3, 15));
    }
}
