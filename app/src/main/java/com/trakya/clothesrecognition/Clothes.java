package com.trakya.clothesrecognition;

import com.google.gson.annotations.SerializedName;

/**
 * Created by isma-ilou on 09.05.2018.
 */

public class Clothes {

    @SerializedName("image")
    private String image;

    @SerializedName("pattern")
    private ClothesPattern pattern;

    @SerializedName("color")
    private ClothesColor color;

    @SerializedName("success")
    private String success;

    public ClothesPattern getPattern ()
    {
        return pattern;
    }

    public void setPattern (ClothesPattern pattern)
    {
        this.pattern = pattern;
    }

    public ClothesColor getColor ()
    {
        return color;
    }

    public void setColor (ClothesColor color)
    {
        this.color = color;
    }

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "Clothes: [pattern = "+pattern+", color = "+color+"]";
    }
}
