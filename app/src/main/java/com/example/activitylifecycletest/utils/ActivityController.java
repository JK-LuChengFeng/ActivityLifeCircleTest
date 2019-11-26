package com.example.activitylifecycletest.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JK_Liu
 * @description:
 * @date :2019/11/26 15:50
 */
public class ActivityController {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static  void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity: activities) {
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }



}
