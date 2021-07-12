package com.ryanhansenwilliam.usersapi.services;

import com.ryanhansenwilliam.usersapi.model.GetUser;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/users")
    Call<GetUser> getUsersList();
}
