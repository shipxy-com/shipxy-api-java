package com.elane.params;

import lombok.Data;

@Data
public class GetPortofCallByPortParams extends BaseObj {
    /**
     * 港口标准五位码
     */
    private String port_code;
    /**
     * 历史靠港记录开始时间，unix 时间戳，start_time与end_time为必填项，表示查询[start_time，end_time]之间的结果，最多1次只能查询1年（366天）的靠港记录
     */
    private Integer start_time;
    /**
     * 历史靠港记录结束时间，unix 时间戳。
     */
    private Integer end_time;
    /**
     * 查询类型（选填）。1，按照ATA（到港时间）查询；2，按照ATD（离港时间）查询。默认值：1
     */
    private Integer type;
    /**
     * 时间类型(选填)。 1当地时区，如果不存在，使用零时区；2北京时区；3零时区，即格林尼治平均时。默认值：2
     */
    private Integer time_zone;
}
