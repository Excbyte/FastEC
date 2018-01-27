package com.bolon.latte.ui.recycler;

import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Administrator
 */

public class MultipleViewHolder extends BaseViewHolder {

    private MultipleViewHolder(View view) {
        super(view);
    }

    public static MultipleViewHolder create(View view) {
        return new MultipleViewHolder(view);
    }
}
