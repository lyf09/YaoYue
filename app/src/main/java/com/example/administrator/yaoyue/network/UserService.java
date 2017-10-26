package com.example.administrator.yaoyue.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/10/26.
 */

public interface UserService {
    @GET("LoginAction")
    Call<List<Repo>> login(@Query("userid") int userid, @Query("userpassword") String userpassword);

    @GET("RegisterAction")
    Call<List<Repo>> register(@Query("userid") int userid, @Query("userpassword") String userpassword, @Query("email") String email);
}
