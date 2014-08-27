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
		System.out.println("����������");
		if(savedInstanceState != null){
			boolean is = savedInstanceState.getBoolean("bool");
			System.out.println("Activity �б���״̬" + is);
		}
		
		
	}
	
	
	

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		System.out.println("Activity �л�");
		super.onConfigurationChanged(newConfig);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		System.out.println("Activity ����״̬");
		outState.putBoolean("bool", true);
		super.onSaveInstanceState(outState);
	}
}
