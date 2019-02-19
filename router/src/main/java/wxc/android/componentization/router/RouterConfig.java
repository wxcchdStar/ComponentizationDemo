package wxc.android.componentization.router;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 长期看此类会变成"巨无霸"。
 * 也可以将一个Module拆成export module和implementation module，将router信息放到export module中。
 */
public class RouterConfig {

    public static final String PATH_FEATURE1_HOME = "/feature1/home";

    public static final String PATH_FEATURE2_HOME = "/feature2/home";

    public static final String ARGS_COUNT = "count";

    public static void goToFeature1Home(int count) {
        ARouter.getInstance()
                .build(RouterConfig.PATH_FEATURE2_HOME)
                .withInt(ARGS_COUNT, count)
                .navigation();
    }

    public static void goToFeature2Home(int count) {
        ARouter.getInstance()
                .build(RouterConfig.PATH_FEATURE1_HOME)
                .withInt(ARGS_COUNT, count)
                .navigation();
    }
}
