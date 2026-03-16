package com.example.lifecycleapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = "ActivityLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy executed");
    }
}
