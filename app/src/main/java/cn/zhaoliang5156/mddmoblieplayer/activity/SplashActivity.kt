package cn.zhaoliang5156.mddmoblieplayer.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import cn.zhaoliang5156.mddmoblieplayer.R

/**
 * 启动页面
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fullScreen()

        setContentView(R.layout.activity_splash)
    }

    /**
     * 全屏显示
     */
    private fun fullScreen() {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }
}
