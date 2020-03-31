package com.sevillainc.apirestretrofit.Interface;

import com.sevillainc.apirestretrofit.model.Posts;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {
    @GET("posts") //lugar de donde viene  la info tiene que estar bien
    Call<List<Posts>> getPosts();
}
