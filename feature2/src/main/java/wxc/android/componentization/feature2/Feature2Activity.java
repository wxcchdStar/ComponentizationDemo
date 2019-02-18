package wxc.android.componentization.feature2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.Locale;

import wxc.android.componentization.base.BaseActivity;
import wxc.android.componentization.router.IFeature1Service;
import wxc.android.componentization.router.RouterConfig;

// 坑：不同的Module之间一级path不能相同
@Route(path = RouterConfig.PATH_FEATURE2_HOME)
public class Feature2Activity extends BaseActivity {
    private static int sCount = 1;

    IFeature1Service mFeature1Service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        mFeature1Service = ARouter.getInstance().navigation(IFeature1Service.class);
        mFeature1Service.sayHello("Feature2");
    }
}
