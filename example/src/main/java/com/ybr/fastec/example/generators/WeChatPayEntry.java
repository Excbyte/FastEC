package com.ybr.fastec.example.generators;

import com.bolon.latte.annotations.PayEntryGenerator;
import com.bolon.latte.wechat.templates.WXPayEntryTemplate;

/**
 * Created by Administrator on 2017/4/22
 */
@SuppressWarnings("unused")
@PayEntryGenerator(
        packageName = "com.ybr.fastec.example",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
