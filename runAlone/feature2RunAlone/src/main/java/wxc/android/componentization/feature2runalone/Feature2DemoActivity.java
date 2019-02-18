package wxc.android.componentization.feature2runalone;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import wxc.android.componentization.feature2.Feature2Activity;

public class Feature2DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, Feature2Activity.class));
    }
}
