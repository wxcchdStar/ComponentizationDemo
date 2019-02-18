package wxc.android.componentization.feature1runalone;

import wxc.android.componentization.base.BaseApplication;
import wxc.android.componentization.feature1.Feature1Application;

public class Feature1DemoApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        new Feature1Application().onCreate();
    }
}
