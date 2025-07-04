package com.elane.params;

import lombok.Data;

@Data
public class GetShipTrackParams extends BaseObj {
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
     * 输出数据格式类型选择：0为二进制 Base64 编码，1为json格式，默认为1
     */
    private Integer output;
}
