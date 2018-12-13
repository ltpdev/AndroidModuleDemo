package com.gdcp.module.common_base;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;

public interface HomeExportService extends IProvider{
     String sayHello(String message);
}
