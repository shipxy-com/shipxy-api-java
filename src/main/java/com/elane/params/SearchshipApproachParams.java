package com.elane.params;

import lombok.Data;

@Data
public class SearchshipApproachParams extends BaseObj {
    /**
     * 船舶编号,船舶mmsi编号
     */
    private Integer mmsi;
    /**
     * 开始时间，utc时间戳。开始时间必须大于当前时间
     */
    private Integer start_time;
    /**
     * 结束时间，utc时间戳。单次请求查询中，开始时间和结束时间的间隔不超过1周。
     */
    private Integer end_time;
    /**
     * 搭靠地区,1代表港口地区搭靠；2代表锚地搭靠；3代表其他地点搭靠；不填写返回全部。
     */
    private Integer approach_zone;
}
