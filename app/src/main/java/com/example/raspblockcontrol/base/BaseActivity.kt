package com.example.raspblockcontrol.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.raspblockcontrol.obj.BaseActivityCollector

abstract class BaseActivity: AppCompatActivity() {
    protected lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initLayoutInflater())
        mContext = this
        initView()
        initData()
        BaseActivityCollector.add(this)
    }

    abstract fun initLayoutInflater():Int

    abstract fun initView()

    abstract fun initData()

    override fun onDestroy() {
        BaseActivityCollector.remove(this)
        super.onDestroy()
    }
}