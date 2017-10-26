package com.example.administrator.yaoyue.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/10/26.
 */

public class DataConnection {
//    private User user = new User();
    //获取实例
    private static Retrofit retrofit = new Retrofit.Builder()
        //设置OKHttpClient,如果不设置会提供一个默认的
            .client(new OkHttpClient())
            .baseUrl("https://api.github.com/")
        //添加Gson转换器
            .addConverterFactory(GsonConverterFactory.create())
            .build();

     private static UserService userservice = retrofit.create(UserService.class);

}
