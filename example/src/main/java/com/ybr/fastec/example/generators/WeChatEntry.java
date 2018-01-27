package com.ybr.fastec.example.generators;

import com.bolon.latte.annotations.EntryGenerator;
import com.bolon.latte.wechat.templates.WXEntryTemplate;

/**
 * Created by Administrator on 2017/4/22
 */

@SuppressWarnings("unused")
@EntryGenerator(
        packageName = "com.ybr.fastec.example",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
