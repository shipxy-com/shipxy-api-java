package com.elane.params;

import lombok.Data;

@Data
public class GetWeatherByPointParams extends BaseObj {
    /**
     * utc时间，Unix时间戳。不填写则查询最近时间的气象数据。
     */
    private String weather_time;
    /**
     * 经度, WGS84坐标系，格式为lng=155.2134
     */
    private Double lng;
    /**
     * 纬度, WGS84坐标系，格式为lat=20.2134
     */
    private Double lat;
}
