package com.example.activitylifecycletest.base;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.activitylifecycletest.utils.ActivityController;

/**
 * @author JK_Liu
 * @description:
 * @date :2019/11/26 15:46
 */
public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "ActivityName is:" + getClass().getSimpleName());
        ActivityController.addActivity(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityController.removeActivity(this);
    }
}
