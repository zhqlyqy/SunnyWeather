package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.DailyResponse
import com.sunnyweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.6/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng")lng:String,@Path("lat")lat:String):Call<RealtimeResponse>//获取实时天气

    @GET("v2.6/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng")lng:String,@Path("lat")lat:String):Call<DailyResponse>//获取未来天气信息
}