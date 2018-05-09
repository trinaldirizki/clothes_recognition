package com.trakya.clothesrecognition;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by isma-ilou on 09.05.2018.
 */

public interface ApiClient {

    @FormUrlEncoded
    @POST("predict")
    Call<Clothes> uploadImage(@Field("title") String title,
                              @Field("image") String image);
}
