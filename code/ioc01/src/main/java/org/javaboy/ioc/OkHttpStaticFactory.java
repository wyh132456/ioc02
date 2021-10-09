package org.javaboy.ioc;

import okhttp3.OkHttpClient;

public class OkHttpStaticFactory {
    public static OkHttpClient okHttpClient;
    public static OkHttpClient getInstance(){
        if (okHttpClient == null){
            okHttpClient = new OkHttpClient.Builder().build();
        }
        return okHttpClient;
    }
}
