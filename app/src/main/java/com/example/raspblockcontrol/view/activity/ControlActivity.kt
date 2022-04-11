package com.example.raspblockcontrol.view.activity

import android.content.Intent
import android.os.Bundle
import com.example.raspblockcontrol.R
import com.example.raspblockcontrol.base.BaseActivity

class ControlActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)
    }

    override fun initLayoutInflater(): Int {
        return R.layout.activity_control
    }

    override fun initView() {

    }

    override fun initData() {

    }

    companion object{
        fun actStart(info:Bundle, activity: BaseActivity){
            val intent = Intent()
            intent.setClass(activity, ControlActivity::class.java)
            intent.putExtras(info)
            activity.startActivity(intent)
        }
    }

}