package wxc.android.componentization.feature2runalone;

import android.content.Intent;
import android.os.Bundle;

import wxc.android.componentization.base.BaseActivity;
import wxc.android.componentization.feature2.Feature2Activity;

public class Feature2DemoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, Feature2Activity.class));
        finish();
    }
}
