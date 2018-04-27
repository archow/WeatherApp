package com.example.abedur_chowdhury.myweatherapp.presenters;

import com.example.abedur_chowdhury.myweatherapp.data.WeatherData;
import com.example.abedur_chowdhury.myweatherapp.mvp.BasePresenter;
import com.example.abedur_chowdhury.myweatherapp.mvp.BaseView;

import java.util.ArrayList;

public interface ILoadWeather {

     interface IPresenter extends BasePresenter {
         void get5DaysWeather();
         void unSubscription();
     }

     interface IView extends BaseView<IPresenter> {
         void onDataFetchLoading();
         void onDataFetchSuccess();
         void onDataFetchError();
         void show5DaysForecast(ArrayList<WeatherData> mWeatherList) ;
    }
}
