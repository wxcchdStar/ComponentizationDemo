package wxc.android.componentization.demo;

import wxc.android.componentization.base.BaseApplication;
import wxc.android.componentization.feature1.Feature1Application;
import wxc.android.componentization.feature2.Feature2Application;

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        // TODO 修改为自动初始化方式
        new Feature1Application().onCreate();
        new Feature2Application().onCreate();
    }
}
