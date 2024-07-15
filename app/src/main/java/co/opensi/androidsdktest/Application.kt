package co.opensi.androidsdktest

import android.app.Application
import co.opensi.kkiapay.uikit.Kkiapay
import co.opensi.kkiapay.uikit.SdkConfig

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        //Initialisation de l'API
        Kkiapay.init(applicationContext,
                "LprYUAyMpfAjq4z2yTHPiY0b6XktIQ",
            SdkConfig(themeColor = R.color.colorPrimary,
                    /* set enableSandbox = false in case you are using live API Keys */
                    enableSandbox = false )
        )
    }
}
