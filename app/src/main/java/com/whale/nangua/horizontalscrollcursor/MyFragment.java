package com.whale.nangua.horizontalscrollcursor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {
	
	
	private int position ; 
	public MyFragment(int position) {
		this.position = position ;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		TextView view = new TextView(getActivity());
		view.setText(" 页面"+position);
		view.setTextSize(50);
		return view;
	}
	

	public void onViewCreated(View view, Bundle savedInstanceState) {
		
	};
}
