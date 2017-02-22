package lg.lgapptheme;

import android.support.v7.app.AppCompatDelegate;

/**
 * Created by zhulianggang on 17/2/22.
 */

public class MyApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        
//        int mode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;

    }
}

