package com.example.android.apis.app;


import android.app.Activity;
import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ViewFlipper;

public class MainGroup extends ActivityGroup{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group);
 		System.out.println("group.onCreate");
		ViewFlipper viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper1);
		
		 LocalActivityManager mManager = getLocalActivityManager();
		

			LocalActivityManager m_ActivityManager = getLocalActivityManager();

			viewFlipper.addView((m_ActivityManager.startActivity(
					"MainActivity", new Intent(
							MainGroup.this, MainActivity.class))
					.getDecorView()), 0);
	        
		
	}
	   
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		System.out.println("group.onSaveInstanceState");
		super.onSaveInstanceState(outState);
	}
}
