package com.example.lenovo.sfarApp.viewpager;

import com.example.lenovo.sfar.R;

public enum ModelObject {


    RED(R.string.string1, R.layout.screen1),
    BLUE(R.string.string2, R.layout.screen2),
    GREEN(R.string.string3, R.layout.screen3);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }


}