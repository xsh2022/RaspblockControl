package com.example.raspblockcontrol.model

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Message
import android.util.Log
import com.example.raspblockcontrol.presenter.StartActivityPresenter
import java.lang.Exception


class StartActivityModelImpl0(override var mPresenter: StartActivityPresenter) :StartActivityModel {

    override fun getIntoConnectActivity() {
        mPresenter.getIntoConnectActivity()
    }

    val mHandler: Handler = @SuppressLint("HandlerLeak")
    object: Handler(){
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)

            mPresenter.getIntoConnectActivity()
        }
    }
    override fun wait(dur: Long?) {
        if (dur != null) {
            if(dur>0)
            {
                try {
                    Thread{
                        mHandler.sendEmptyMessageDelayed(0, dur)
                    }.start()
                }catch (e:Exception){
                    Log.e("StartActivityModelImpl0","Counting failed due to unknown error.")
                }
            }
        }
    }
}