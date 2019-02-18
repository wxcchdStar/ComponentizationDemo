package wxc.android.componentization.feature1;

import android.app.Application;
import android.util.Log;

public class Feature1Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Feature1Application", "onCreate");
    }
}
