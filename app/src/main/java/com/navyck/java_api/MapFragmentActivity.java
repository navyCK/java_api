package com.navyck.java_api;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.CameraUpdate;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.UiSettings;
import com.naver.maps.map.util.FusedLocationSource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MapFragmentActivity extends AppCompatActivity {
    private MapView mapView;
    private NaverMap naverMap;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_map);

        mapView = findViewById(R.id.map_view);
        mapView.getMapAsync((OnMapReadyCallback) this);
        mapView.onCreate(savedInstanceState);
    }

//    protected void onMapReady(NaverMap map) {
//        naverMap = map;
//        naverMap.setMaxZoom(18.0);
//        naverMap.setMinZoom(10.0);
//
//        LatLng latLng = new LatLng(37.497801, 127.027591);
//        CameraUpdate cameraUpdate = CameraUpdate.scrollTo(latLng);
//        naverMap.moveCamera(cameraUpdate);
//
//        UiSettings uiSettings = naverMap.getUiSettings();
//        uiSettings.isLocationButtonEnabled();
//
//
//
//    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
}
