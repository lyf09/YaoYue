package com.example.administrator.yaoyue.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2017/10/26.
 */

public interface UserService {
    @GET("LoginAction")
    Call<MessageData> login(@Path("userid") String userid, @Path("userpassword") String userpassword);
}
