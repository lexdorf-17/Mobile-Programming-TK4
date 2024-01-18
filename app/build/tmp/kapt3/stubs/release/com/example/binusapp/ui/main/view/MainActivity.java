package com.example.binusapp.ui.main.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0015J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/binusapp/ui/main/view/MainActivity;", "Lcom/example/binusapp/core/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "LOCATION_PERMISSION_REQUEST_CODE", "", "binding", "Lcom/example/binusapp/databinding/ActivityMainBinding;", "isRefreshed", "", "mFusedLocClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "mLocCallback", "Lcom/google/android/gms/location/LocationCallback;", "mLocRequest", "Lcom/google/android/gms/location/LocationRequest;", "mapFrag", "Lcom/google/android/gms/maps/SupportMapFragment;", "checkLocationPermission", "", "initMaps", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "setCurrentLocation", "latlong", "Lcom/google/android/gms/maps/model/LatLng;", "setUpMap", "updateCurrentLocation", "app_release"})
public final class MainActivity extends com.example.binusapp.core.BaseActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.example.binusapp.databinding.ActivityMainBinding binding;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    private com.google.android.gms.maps.GoogleMap mGoogleMap;
    private com.google.android.gms.location.LocationRequest mLocRequest;
    private boolean isRefreshed = true;
    private com.google.android.gms.maps.SupportMapFragment mapFrag;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocClient;
    private com.google.android.gms.location.LocationCallback mLocCallback;
    private final int LOCATION_PERMISSION_REQUEST_CODE = 100;
    
    public MainActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initMaps() {
    }
    
    private final void setCurrentLocation(com.google.android.gms.maps.model.LatLng latlong) {
    }
    
    @java.lang.Override
    public void onMapReady(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final void setUpMap() {
    }
    
    private final void updateCurrentLocation() {
    }
    
    private final void checkLocationPermission() {
    }
}