package com.ytz.dailyvoc.adapters;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

public class FragmentAdapter extends FragmentPagerAdapter{
    
    public static final String TAG = "FragmentAdapter";
    
	
	private FragmentManager fragmentManager;
	private List<Fragment> list;
	
   public FragmentAdapter(FragmentManager fm,List<Fragment> list){
	   super(fm);
	   this.list = list;
   }

   @Override
   public Fragment getItem(int p1) {
	   return list.get(p1);
   }

   @Override
   public int getCount() {
	   return list.size();
   }
   
}
