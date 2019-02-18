package wxc.android.componentization.feature2;

import android.app.Application;
import android.util.Log;

import wxc.android.componentization.base.BaseApplication;

public class Feature2Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Feature2Application", "onCreate");
    }
}
