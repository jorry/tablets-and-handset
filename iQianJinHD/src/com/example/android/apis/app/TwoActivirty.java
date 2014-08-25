package com.example.android.apis.app;

import com.example.android.apis.app.SildingFinishLayout.OnSildingFinishListener;

import android.app.Activity;
import android.os.Bundle;

/**
 * 
 * @author jorry_liu
 *
 */
public class TwoActivirty extends SwipeBackActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two);
		SildingFinishLayout mSildingFinishLayout = (SildingFinishLayout) findViewById(R.id.sildingFinishLayout);  
        mSildingFinishLayout  
                .setOnSildingFinishListener(new OnSildingFinishListener() {  
  
                    @Override  
                    public void onSildingFinish() {  
                         finish();  
                    }  
                });  
  
        // touchView要设置到ListView上面  
        mSildingFinishLayout.setTouchView(findViewById(R.id.details));  
        
	}
}
