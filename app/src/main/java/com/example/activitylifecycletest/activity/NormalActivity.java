package com.example.activitylifecycletest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import com.example.activitylifecycletest.R;
import com.example.activitylifecycletest.base.BaseActivity;
import com.example.activitylifecycletest.utils.ActivityController;

/**
 * Create By JK_Liu on 2019/11/25
 */
public class NormalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//此行代码必须在setContentView之前执行，否则会报错。
        setContentView(R.layout.activity_normal);
    }

    /**
     * 启动活动的最佳写法
     */
    public static void actionStart(Context context,String str1, String str2){
        Bundle bundle = new Bundle();
        bundle.putString("str1",str1);
        bundle.putString("str2",str2);
        Intent intent = new Intent(context,NormalActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);


    }


    @Override
    public void onBackPressed() {
        ActivityController.finishAll();
    }
}
