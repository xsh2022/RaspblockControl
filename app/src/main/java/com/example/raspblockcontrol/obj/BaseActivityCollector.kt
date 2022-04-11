package com.example.raspblockcontrol.obj

import android.util.Log
import com.example.raspblockcontrol.base.BaseActivity

object BaseActivityCollector {
    private lateinit var activityList:ArrayList<BaseActivity>

    fun add(activity: BaseActivity){
        activityList.add(activity)
        Log.d("BaseActivityManager","Activity \""+activity.localClassName+"\"has been added into the manager")
    }

    fun remove(activity: BaseActivity){
        activityList.remove(activity)
        Log.d("BaseActivityManager","Activity \""+activity.localClassName+"\"has been deleted from the manager")
    }

}