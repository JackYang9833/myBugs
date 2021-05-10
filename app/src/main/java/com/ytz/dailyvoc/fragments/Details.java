package com.ytz.dailyvoc.fragments;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ytz.dailyvoc.R;

public class Details extends Fragment{
    
    public static final String TAG = "Details";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_details,null);
		return v;
	}
    
    
    
}
