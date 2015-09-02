package com.example.gittest;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public void setContentView(int layoutResID) {
		
		super.setContentView(layoutResID);
		
		initView();
		
		initData();
		
		bindEvent();
	
	}
	
	protected abstract void initView();
	
	protected abstract void initData();
	
	protected abstract void bindEvent();

}
