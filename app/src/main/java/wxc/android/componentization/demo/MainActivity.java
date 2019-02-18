package wxc.android.componentization.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import wxc.android.componentization.base.BaseActivity;
import wxc.android.componentization.feature1.Feature1Activity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_feature1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Feature1Activity.class);
                startActivity(intent);
            }
        });
    }
}
