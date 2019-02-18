package wxc.android.componentization.feature2;

import android.app.Application;
import android.util.Log;

public class Feature2Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Feature1Application", "onCreate");
    }
}
