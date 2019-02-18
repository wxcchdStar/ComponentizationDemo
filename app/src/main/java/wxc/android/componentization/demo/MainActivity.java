package wxc.android.componentization.demo;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

import wxc.android.componentization.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_feature1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoFeature1();
            }
        });
    }

    private void gotoFeature1() {
        ARouter.getInstance()
                .build("/feature1/home")
                .navigation();
    }
}
