package wxc.android.componentization.demo.service;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

import wxc.android.componentization.router.IAppService;

@Route(path = "/app/service")
public class AppServiceImpl implements IAppService {

    @Override
    public void sayBye(String name) {
        Log.d("AppServiceImpl", "Bye " + name);
    }

    @Override
    public void init(Context context) {

    }
}
