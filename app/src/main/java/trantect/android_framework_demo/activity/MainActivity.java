package trantect.android_framework_demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import trantect.android_framework_demo.R;

/**
 * Create by Trantect on 14-7-2.
 */
public class MainActivity extends Activity {

    private Button bt_welcome;

    private TextView tv_welcome;

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        Log.d(getTag(), "onCreate");
        setContentView(R.layout.welcome_main);
        initViews();
        onViewClick();
    }

    @Override
    public void onStart() {
        Log.d(getTag(), "onStart");
        super.onStart();
    }

    private String getTag() {
        return getPackageName().toString() + getClass().toString();
    }

    // init some views
    private void initViews(){
        bt_welcome = (Button)findViewById(R.id.bt_welcome);
        tv_welcome = (TextView)findViewById(R.id.tv_welcome);
        showBtView();
    }

    private void onViewClick(){
        MyListener myListener = new MyListener();
        bt_welcome.setOnClickListener(myListener);
        tv_welcome.setOnClickListener(myListener);
    }

    class MyListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id){
                case R.id.bt_welcome:
                    showTvView();
                    break;
                case R.id.tv_welcome:
                    showBtView();
                    break;
            }
        }
    }

    // show Button
    private void showBtView(){
        bt_welcome.setVisibility(View.VISIBLE);
        tv_welcome.setVisibility(View.GONE);
    }

    // show TextView
    private void showTvView(){
        tv_welcome.setVisibility(View.VISIBLE);
        bt_welcome.setVisibility(View.GONE);
    }
}
