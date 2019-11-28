package com.arpaul.testheremaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    private static final String LOG_TAG = StartActivity.class.getSimpleName();

    // permissions request code
    private final static int REQUEST_CODE_ASK_PERMISSIONS = 1;

    /**
     * Permissions that need to be explicitly requested from end user.
     */
    private static final String[] REQUIRED_SDK_PERMISSIONS = new String[] {
            Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.WRITE_EXTERNAL_STORAGE };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


    }

    @Override
    protected void onResume() {
        super.onResume();
        ActivityCompat.requestPermissions(this, REQUIRED_SDK_PERMISSIONS, REQUEST_CODE_ASK_PERMISSIONS);
    }

    public void onNext(View view) {
        startActivity(new Intent(StartActivity.this, MainActivity.class));
    }
}
