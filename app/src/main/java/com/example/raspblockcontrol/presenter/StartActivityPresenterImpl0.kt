package com.example.raspblockcontrol.presenter

import com.example.raspblockcontrol.model.StartActivityModel
import com.example.raspblockcontrol.model.StartActivityModelImpl0
import com.example.raspblockcontrol.view.activity.MainActivity

class StartActivityPresenterImpl0(
    override var mActivity: MainActivity,
) :StartActivityPresenter {
    override var mModel: StartActivityModel = StartActivityModelImpl0(this)

    override fun setActivity(activity: MainActivity) {
        mActivity = activity
    }

    override fun getActivity(): MainActivity {
        return mActivity
    }



    override fun getIntoConnectActivity() {
        mActivity.getIntoConnectActivity()
    }

    override fun wait(dur: Long?) {
        mModel.wait(dur)
    }
}