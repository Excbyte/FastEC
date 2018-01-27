package com.bolon.latte.delegates.web.event;

import com.bolon.latte.util.log.LatteLogger;

/**
 * Created by Administrator
 */

public class UndefineEvent extends Event {
    @Override
    public String execute(String params) {
        LatteLogger.e("UndefineEvent", params);
        return null;
    }
}
