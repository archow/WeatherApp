package com.example.abedur_chowdhury.myweatherapp.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("speed")
    @Expose
    private String speed;

    public String getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed='" + speed + '\'' +
                '}';
    }
}
