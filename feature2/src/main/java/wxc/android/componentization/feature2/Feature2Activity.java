package wxc.android.componentization.feature2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.Locale;

import wxc.android.componentization.base.BaseActivity;
import wxc.android.componentization.router.RouterConfig;
import wxc.android.componentization.router.app.IAppService;
import wxc.android.componentization.router.feature1.IFeature1Service;

// 坑：不同的Module之间一级path不能相同
@Route(path = RouterConfig.PATH_FEATURE2_HOME)
public class Feature2Activity extends BaseActivity {
    private static int sCount = 1;

    @Autowired
    IFeature1Service mFeature1Service;

    // Feature2可以调用App的方法，那么也就是说我们可以实现渐进式组件化
    @Autowired
    IAppService mAppService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);

        super.onCreate(savedInstanceState);
        setTitle(R.string.feature2_app_name);
        setContentView(R.layout.feature2_activity_feature2);

        int count = getIntent().getIntExtra(RouterConfig.ARGS_COUNT, 1);
        TextView textView = findViewById(R.id.tv_content);
        textView.setText(String.format(Locale.ENGLISH, "Start count: %d", count));

        findViewById(R.id.btn_goto_feature1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RouterConfig.goToFeature2Home(++sCount);
            }
        });

//        mFeature1Service = ARouter.getInstance().navigation(IFeature1Service.class);
        mFeature1Service.sayHello("Feature2");
//        mAppService.sayBye("Feature2");
    }
}
