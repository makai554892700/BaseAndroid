package www.mys.com.baseandroid;

import android.app.Application;

import www.mys.com.baseandroid.utils.MySettings;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MySettings.init(getApplicationContext());
    }
}
