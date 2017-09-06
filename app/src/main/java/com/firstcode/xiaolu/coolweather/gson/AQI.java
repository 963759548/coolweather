package com.firstcode.xiaolu.coolweather.gson;

/**
 * Created by Administrator on 2017/9/6 0006.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
