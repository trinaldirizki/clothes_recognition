package com.trakya.clothesrecognition;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by isma-ilou on 09.05.2018.
 */

public interface ApiClient {

    @Multipart
    @POST("/predict")
    Call<Clothes> uploadImage(@Part MultipartBody.Part image);
}
