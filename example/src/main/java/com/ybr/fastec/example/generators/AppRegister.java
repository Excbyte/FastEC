package com.ybr.fastec.example.generators;

import com.bolon.latte.annotations.AppRegisterGenerator;
import com.bolon.latte.wechat.templates.AppRegisterTemplate;

/**
 * Created by Administrator on 2017/4/22
 */
@SuppressWarnings("unused")
@AppRegisterGenerator(
        packageName = "com.ybr.fastec.example",
        registerTemplate = AppRegisterTemplate.class
)
public interface AppRegister {
}
