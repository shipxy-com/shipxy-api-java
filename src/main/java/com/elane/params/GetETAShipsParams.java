package com.elane.params;

import lombok.Data;

@Data
public class GetETAShipsParams extends BaseObj {
    /**
     * 港口标准code,港口标准五位码
     */
    private String port_code;
    /**
     * 开始时间，utc时间戳。开始时间必须大于当前时间
     */
    private Integer start_time;
    /**
     * 结束时间，utc时间戳。单次请求查询中，开始时间和结束时间的间隔不超过1周。
     */
    private Integer end_time;
    /**
     * 船舶类型, 筛选船舶的类型，船舶类型清单请参考文档，不填写时返回全部船舶。
     */
    private Integer ship_type;
}
