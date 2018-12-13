package com.gdcp.module.androidmoduledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.gdcp.module.common_base.HomeExportService;

@Route(path = "/app/second")
public class SecondActivity extends AppCompatActivity {
    @Autowired(name = "/home/HomeService")
    HomeExportService homeService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ARouter.getInstance().inject(this);
    }

    public void callMethod2(View view) {
        Toast.makeText(this, homeService.sayHello("主模块"), Toast.LENGTH_SHORT).show();
    }
}
