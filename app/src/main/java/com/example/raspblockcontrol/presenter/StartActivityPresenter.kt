package com.example.raspblockcontrol.presenter

import com.example.raspblockcontrol.model.StartActivityModel
import com.example.raspblockcontrol.view.activity.MainActivity

interface StartActivityPresenter {
    var mActivity:MainActivity
    var mModel:StartActivityModel


    fun setActivity(activity: MainActivity)

    fun getActivity():MainActivity

    fun getIntoConnectActivity()

    fun wait(dur:Long?)
}