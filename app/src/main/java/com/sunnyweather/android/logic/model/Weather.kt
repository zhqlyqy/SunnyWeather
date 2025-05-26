package com.sunnyweather.android.logic.model
//====================================天气信息,对实时天气以及未来天气的封装=============================================
data class Weather(val realtime: RealtimeResponse.Realtime,val daily :DailyResponse.Daily)