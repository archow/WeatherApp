package com.example.abedur_chowdhury.myweatherapp.activities.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.abedur_chowdhury.myweatherapp.R;
import com.example.abedur_chowdhury.myweatherapp.data.Weather;

public class WeatherDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_detail);

        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putParcelable("weather",
                    getIntent().getParcelableExtra("weather"));
        }

        Weather mWeather = getIntent().getParcelableExtra("weather");
        TextView mTextView = (TextView)findViewById(R.id.textView);
        mTextView.setText(mWeather.toString());

    }
}
