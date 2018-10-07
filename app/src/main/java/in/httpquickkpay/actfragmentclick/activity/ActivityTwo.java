package in.httpquickkpay.actfragmentclick.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


import in.httpquickkpay.actfragmentclick.OnBoardingAnim.slider.MyPageAdapter;
import in.httpquickkpay.actfragmentclick.R;
import me.relex.circleindicator.CircleIndicator;

public class ActivityTwo extends FragmentActivity {

    MyPageAdapter adapter;
    static ViewPager pager;
    static Context mContext;
    static Button btn_skip;

    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        mContext = this;
        adapter = new MyPageAdapter(getSupportFragmentManager(), mContext);
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
        btn_skip = (Button) findViewById(R.id.btn_skip);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(pager);

        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (position == 2) {
                    btn_skip.setText("DONE");
                } else {
                    btn_skip.setText("SKIP");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        findViewById(R.id.btn_skip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* startActivity(new Intent(ActivityTwo.this, ActivityLogin.class));
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);*/
            }
        });
    }




}
