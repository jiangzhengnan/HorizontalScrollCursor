package com.whale.nangua.horizontalscrollcursor;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity implements HorizontalScrollCursor.onViewPagerChanggedListner{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);

		mViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public Fragment getItem(int arg0) {
                return new MyFragment(arg0);
            }
        });
        HorizontalScrollCursor cursor = (HorizontalScrollCursor) findViewById(R.id.title);
        cursor.setcallback(this);
        cursor.setViewPager(mViewPager);
		
	}

    @Override
    public void CheckPage(int position) {
        //这里实现对其他UI的更新
    }
}
