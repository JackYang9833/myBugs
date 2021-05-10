package com.ytz.dailyvoc.activity;
import com.ytz.dailyvoc.BaseActivity;
import com.ytz.dailyvoc.R;
import android.widget.Button;
import android.os.Bundle;
import com.ytz.dailyvoc.factorys.CardIDs;
import android.widget.TextView;
import android.widget.ImageView;
import android.util.Log;

public class MainActivity extends BaseActivity {
	
	CardIDs cardIds;
	TextView dt_num,dt_word,dt_EXP,dt_PT,dt_GRP,dt_GFKS;
	ImageView dt_SPK;
	@Override
	public int setLayout() {
		return R.layout.activity_main;
	}
	@Override
	public void initView() {
		dt_num = bindView(R.id.detail_layout_num);
		
		System.out.println(cardIds.CARD_EXP);
		Log.i("MainActivity","id="+dt_num);
		}
}
