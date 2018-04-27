package com.example.abedur_chowdhury.myweatherapp.interfaces;



import com.example.abedur_chowdhury.myweatherapp.conf.Constants;
import com.example.abedur_chowdhury.myweatherapp.data.WeatherResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Interface to make a connection with the webservice using Retrofit
 */
public interface RestWeatherInterface {
    @GET(Constants.URL_5_DAYS+Constants.API_KEY)
    Observable<WeatherResponse> getWeather5DaysForecast();
}
