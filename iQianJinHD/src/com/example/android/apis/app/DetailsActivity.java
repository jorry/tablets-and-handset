package com.example.android.apis.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

@SuppressLint("NewApi")
public class DetailsActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.listotodetails);

//		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//			// If the screen is now in landscape mode, we can show the
//			// dialog in-line with the list so we don't need this activity.
//			finish();
//			return;
//		}
//
//		if (savedInstanceState == null) {
//			// During initial setup, plug in the details fragment.
//			DetailsFragment details = new DetailsFragment();
//			details.setArguments(getIntent().getExtras());
//			getFragmentManager().beginTransaction()
//					.add(android.R.id.content, details).commit();
//		}
	}

	
}