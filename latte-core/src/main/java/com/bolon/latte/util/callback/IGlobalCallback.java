package com.bolon.latte.util.callback;

import android.support.annotation.Nullable;

/**
 * Created by Administrator
 */

public interface IGlobalCallback<T> {

    void executeCallback(@Nullable T args);
}
