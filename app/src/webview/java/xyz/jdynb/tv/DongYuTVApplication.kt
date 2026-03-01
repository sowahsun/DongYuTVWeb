package xyz.jdynb.tv

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.drake.brv.utils.BRV
import com.drake.engine.base.Engine
import xyz.jdynb.tv.utils.CrashHandler

class DongYuTVApplication : Application() {

  companion object {

    @SuppressLint("StaticFieldLeak")
    lateinit var context: Context

    private const val TAG = "DongYuTVApplication"

  }

  override fun onCreate() {
    super.onCreate()
    context = this
    CrashHandler.getInstance().init()

    Engine.initialize(this)
    BRV.modelId = BR.m
  }
}