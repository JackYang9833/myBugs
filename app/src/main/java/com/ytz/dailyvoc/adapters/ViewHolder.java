package com.ytz.dailyvoc.adapters;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

public class ViewHolder extends RecyclerView.ViewHolder {
    
	private SparseArray<View> mViews;
    private View mConvertView;
    private Context mContext;
	
    public ViewHolder(Context context,View itemView,ViewGroup parent){
		super(itemView);
		mContext = context;
		mConvertView = itemView;
		mViews = new SparseArray<View>();
	}
}
