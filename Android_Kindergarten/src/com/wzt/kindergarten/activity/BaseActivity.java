package com.wzt.kindergarten.activity;

import com.wzt.kindergarten.utils.AppManager;

import android.app.Activity;

public class BaseActivity extends Activity {
	
	public void init(){
		AppManager.getAppManager().addActivity(this);
		initView();
	}

	/**
	 * 加载控件
	 */
	public void initView() {
		
	}
	
	/**
	 * 加载数据
	 */
	public void loadData(){
		
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		AppManager.getAppManager().finishActivity(this);
	}
}
