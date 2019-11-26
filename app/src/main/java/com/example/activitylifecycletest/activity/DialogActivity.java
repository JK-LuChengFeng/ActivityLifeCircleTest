package com.example.activitylifecycletest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.activitylifecycletest.R;
import com.example.activitylifecycletest.base.BaseActivity;

/**
 * Create By JK_Liu on 2019/11/25
 */
public class DialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }
}
