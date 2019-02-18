package wxc.android.componentization.feature1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.Locale;

import wxc.android.componentization.base.BaseActivity;

// 坑：不同的Module之间一级path不能相同
@Route(path = "/feature1/home")
public class Feature1Activity extends BaseActivity {
    private static int sCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.feature1_app_name);
        setContentView(R.layout.feature1_activity_feature1);

        int count = getIntent().getIntExtra("count", 1);
        TextView textView = findViewById(R.id.tv_content);
        textView.setText(String.format(Locale.ENGLISH, "Start count: %d", count));

        findViewById(R.id.btn_goto_feature2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO 通过接口等方式生成协议，不要手动传递参数
                // 单独编译无法打开Feature2，也无法调用Feature2中的方法，需要我们自己Mock
                ARouter.getInstance()
                        .build("/feature2/home")
                        .withInt("count", sCount++)
                        .navigation();
            }
        });
    }
}
