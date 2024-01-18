package com.example.binusapp.ui.main.view

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Looper
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.binusapp.BaseApplication
import com.example.binusapp.R
import com.example.binusapp.core.BaseActivity
import com.example.binusapp.databinding.ActivityMainBinding
import com.example.binusapp.ui.login.view.LoginActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng


class MainActivity : BaseActivity(), OnMapReadyCallback {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mGoogleSignInClient: GoogleSignInClient

    private lateinit var mGoogleMap: GoogleMap
    private lateinit var mLocRequest: LocationRequest

    private var isRefreshed = true
    private var mapFrag: SupportMapFragment? = null
    private var mFusedLocClient: FusedLocationProviderClient? = null

    private var mLocCallback: LocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            val locationList = locationResult.locations
            if (locationList.isNotEmpty()) {
                val location = locationList.last()
                setCurrentLocation(LatLng(location.latitude, location.longitude))
            }
        }
    }

    private val LOCATION_PERMISSION_REQUEST_CODE = 100

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        mGoogleSignInClient = GoogleSignIn.getClient(this,gso)

        binding.apply {
            textUsername.text = "Hallo ${BaseApplication.appPreferences.getUserName()}"
            btnLogout.setOnClickListener {
                mGoogleSignInClient.signOut().addOnCompleteListener {
                    BaseApplication.appPreferences.apply {
                        setLogin(false)
                        setUserName("")
                        setEmail("")
                    }

                    val intent= Intent(this@MainActivity, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }

        initMaps()
    }

    private fun initMaps(){
        mFusedLocClient = LocationServices.getFusedLocationProviderClient(this)
        mapFrag = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFrag?.getMapAsync(this)
    }

    private fun setCurrentLocation(latlong : LatLng) {
        mGoogleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latlong, 18f))
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mGoogleMap = googleMap
        setUpMap()
    }

    @Suppress("DEPRECATION")
    private fun setUpMap(){
        mLocRequest = LocationRequest.create().apply {
            interval = 10000
            fastestInterval = 2000
            priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
            maxWaitTime= 100
        }

        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            updateCurrentLocation()
        } else {
            checkLocationPermission()
        }
    }

    private fun updateCurrentLocation(){
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE
            )
            return
        }else{
            mFusedLocClient?.requestLocationUpdates(mLocRequest, mLocCallback, Looper.myLooper()!!)
            mGoogleMap.isMyLocationEnabled = true
            mGoogleMap.setOnMyLocationButtonClickListener {
                isRefreshed = true
                mFusedLocClient?.requestLocationUpdates(mLocRequest, mLocCallback, Looper.myLooper()!!)
                false
            }
            mGoogleMap.setPadding(0, 0, 0, 0)
            mGoogleMap.setOnCameraMoveStartedListener {
                if (!isRefreshed) {
                    mFusedLocClient?.removeLocationUpdates(mLocCallback)
                } else {
                    isRefreshed = false
                }
            }
        }
    }

    private fun checkLocationPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                LOCATION_PERMISSION_REQUEST_CODE
            )
        }
    }
}