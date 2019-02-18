package wxc.android.componentization.feature1.service;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

import wxc.android.componentization.router.IFeature1Service;

@Route(path = "/feature1/service/hello")
public class Feature1ServiceImpl implements IFeature1Service {

    @Override
    public void sayHello(String name) {
        Log.d("Feature1ServiceImpl", "Hello, " + name);
    }

    @Override
    public void init(Context context) {
        Log.d("Feature1ServiceImpl", "init: " + context);
    }
}
