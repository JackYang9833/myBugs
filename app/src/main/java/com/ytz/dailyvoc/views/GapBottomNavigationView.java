package com.ytz.dailyvoc.views;
import android.annotation.NonNull;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView.SavedState;
import android.support.v7.view.menu.MenuBuilder;

public class GapBottomNavigationView extends FrameLayout{
    private MenuBuilder mMenu;
	public GapBottomNavigationView(Context context){
		super(context,null);
	}
	public GapBottomNavigationView(Context context,AttributeSet attrs){
		super(context,attrs,0);
	}
	public GapBottomNavigationView(Context context,AttributeSet attrs,int defStyle){
		super(context,attrs,defStyle);
	}

	@Override
	protected Parcelable onSaveInstanceState() {
		Parcelable superState = super.onSaveInstanceState();
        SavedState savedState = new SavedState(superState);
        savedState.menuPresenterState = new Bundle();
        mMenu.savePresenterStates(savedState.menuPresenterState);
        return savedState;
	}
	@Override
    protected void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        mMenu.restorePresenterStates(savedState.menuPresenterState);
    }

    static class SavedState extends AbsSavedState {
        Bundle menuPresenterState;

        public SavedState(Parcelable superState) {
            super(superState);
        }

        public SavedState(Parcel source, ClassLoader loader) {
            super(source, loader);
            readFromParcel(source, loader);
        }

        @Override
        public void writeToParcel(@NonNull Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeBundle(menuPresenterState);
        }

        private void readFromParcel(Parcel in, ClassLoader loader) {
            menuPresenterState = in.readBundle(loader);
        }

        public static final Creator<SavedState> CREATOR =
		ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() {
				@Override
				public SavedState createFromParcel(Parcel in, ClassLoader loader) {
					return new SavedState(in, loader);
				}

				@Override
				public SavedState[] newArray(int size) {
					return new SavedState[size];
				}
			});
    }
}
