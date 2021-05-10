package com.ytz.dailyvoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.annotation.IdRes;

/**
*@DESC:BaseActivity:继承CompatActivity,能实现普通Activity的方法,另外实现了点击彻底退出程序的功能以及标题栏选项菜单
*
*/
public abstract class BaseActivity extends AppCompatActivity {
   boolean isExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(setLayout());
		initView();
    }
	//抽象方法 返回程序布局文件
	public abstract int setLayout();
	/**
	*初始化布局
	*/
	public abstract void initView();
	/**
	*findViewById
	*/
	public <T extends View>T bindView(@IdRes int id){
		return (T)findViewById(id);
	}
}
