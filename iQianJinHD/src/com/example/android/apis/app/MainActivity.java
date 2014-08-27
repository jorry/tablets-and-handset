package com.example.android.apis.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("进来了了吗");
		if(savedInstanceState != null){
			boolean is = savedInstanceState.getBoolean("bool");
			System.out.println("Activity 有保存状态" + is);
		}
		
		
	}
	
	
	

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		System.out.println("Activity 切换");
		super.onConfigurationChanged(newConfig);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		System.out.println("Activity 保存状态");
		outState.putBoolean("bool", true);
		super.onSaveInstanceState(outState);
	}
}
