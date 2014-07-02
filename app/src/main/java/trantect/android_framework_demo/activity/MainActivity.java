package trantect.android_framework_demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import trantect.android_framework_demo.R;

/**
 * Create by Trantect on 14-7-2.
 */
public class MainActivity extends Activity {

    private String getTag() {
        return getPackageName().toString() + getClass().toString();
    }

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        Log.d(getTag(), "onCreate");
        setContentView(R.layout.welcome_main);
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
