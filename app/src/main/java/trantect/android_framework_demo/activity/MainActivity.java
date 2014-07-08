package trantect.android_framework_demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import trantect.android_framework_demo.R;

/**
 * Create by Trantect on 14-7-2.
 */
// use the way to init the Activity
@EActivity(R.layout.welcome_main)
public class MainActivity extends Activity {

    // use the way to init views
    @ViewById(R.id.bt_welcome)
    protected Button bt_welcome;

    @ViewById(R.id.tv_welcome)
    protected TextView tv_welcome;

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        Log.d("MainActivity", "onCreate");
    }

    @AfterViews
    protected void initView(){
        showBtView();
    }

    @Override
    public void onStart() {
        Log.d("MainActivity", "onStart");
        super.onStart();
    }

    // use the way to replace the event of Button click
    @Click(R.id.bt_welcome)
    protected void onClickButton(){
        showTvView();
    }

    // use the way to replace the event of TextView click
    @Click(R.id.tv_welcome)
    protected void onClickTextView(){
        showBtView();
    }

    // show Button
    @UiThread
    protected void showBtView(){
        bt_welcome.setVisibility(View.VISIBLE);
        tv_welcome.setVisibility(View.GONE);
    }

    // show TextView
    @UiThread
    protected void showTvView(){
        tv_welcome.setVisibility(View.VISIBLE);
        bt_welcome.setVisibility(View.GONE);
    }
}
