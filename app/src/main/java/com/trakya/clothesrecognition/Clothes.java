package com.trakya.clothesrecognition;

import com.google.gson.annotations.SerializedName;

/**
 * Created by isma-ilou on 09.05.2018.
 */

public class Clothes {

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String image;

    @SerializedName("response")
    private String response;

    public String getResponse() {
        return response;
    }
}
