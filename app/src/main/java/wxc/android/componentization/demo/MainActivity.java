package wxc.android.componentization.demo;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;

import wxc.android.componentization.base.BaseActivity;
import wxc.android.componentization.router.IFeature1Service;

public class MainActivity extends BaseActivity {

    // App可以调用Feature1的方法，那么也就是说我们可以实现渐进式组件化
    @Autowired
    IFeature1Service mFeature1Service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_feature1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoFeature1();
            }
        });

        mFeature1Service.sayHello("Main");
    }

    private void gotoFeature1() {
        ARouter.getInstance()
                .build("/feature1/home")
                .navigation();
    }
}
