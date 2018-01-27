package com.bolon.latte.ec.main.personal.order;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.bolon.latte.ec.R;
import com.bolon.latte.delegates.LatteDelegate;
import com.bolon.latte.ui.widget.AutoPhotoLayout;
import com.bolon.latte.ui.widget.StarLayout;
import com.bolon.latte.util.callback.CallbackManager;
import com.bolon.latte.util.callback.CallbackType;
import com.bolon.latte.util.callback.IGlobalCallback;


/**
 * Created by Administrator
 */

public class OrderCommentDelegate extends LatteDelegate {

    private StarLayout mStarLayout = null;
    private AutoPhotoLayout mAutoPhotoLayout = null;

    void onClickSubmit() {
        Toast.makeText(getContext(), "评分： " + mStarLayout.getStarCount(), Toast.LENGTH_LONG).show();
    }

    @Override
    public Object setLayout() {
        return R.layout.delegate_order_comment;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        mStarLayout = $(R.id.custom_star_layout);
        mAutoPhotoLayout = $(R.id.custom_auto_photo_layout);
        $(R.id.top_tv_comment_commit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickSubmit();
            }
        });
        mAutoPhotoLayout.setDelegate(this);
        CallbackManager.getInstance()
                .addCallback(CallbackType.ON_CROP, new IGlobalCallback<Uri>() {
                    @Override
                    public void executeCallback(@Nullable Uri args) {
                        mAutoPhotoLayout.onCropTarget(args);
                    }
                });
    }
}
