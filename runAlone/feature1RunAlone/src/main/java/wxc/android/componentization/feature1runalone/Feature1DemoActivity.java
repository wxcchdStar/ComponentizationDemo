package wxc.android.componentization.feature1runalone;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import wxc.android.componentization.feature1.Feature1Activity;

public class Feature1DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, Feature1Activity.class));
        finish();
    }
}
