package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Create By JK_Liu on ${DATE}
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private Button btn_normal, btn_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: ------MainActivity");

        initView();

    }

    private void initView() {
        btn_normal = findViewById(R.id.btn_normal);
        btn_normal.setOnClickListener(this);
        btn_dialog = findViewById(R.id.btn_dialog);
        btn_dialog.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ------MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ------MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ------MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ------MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ------MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: ------MainActivity");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_normal:
                intent.setClass(MainActivity.this,NormalActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_dialog:
                intent.setClass(MainActivity.this,DialogActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
