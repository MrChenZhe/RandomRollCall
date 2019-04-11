package com.qianfeng.Listener;

import org.springframework.web.context.WebApplicationContext;

public class SpringApplicationContextUtils {
    private static  WebApplicationContext applicationContext;

    public static WebApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(WebApplicationContext applicationContext) {
        SpringApplicationContextUtils.applicationContext = applicationContext;
    }
}
