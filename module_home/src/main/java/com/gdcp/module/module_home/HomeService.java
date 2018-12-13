package com.gdcp.module.module_home;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.gdcp.module.common_base.HomeExportService;
@Route(path = "/home/HomeService")
public class HomeService implements HomeExportService{
    @Override
    public String sayHello(String message) {
        return "homeService say hello to"+message;
    }

    @Override
    public void init(Context context) {

    }
}
