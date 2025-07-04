package com.elane.result;

import lombok.Data;

@Data
public class ShipResult {
    /**
     * 船舶mmsi编号,船舶mmsi编号，9 位数字
     */
    private Integer mmsi;

    /**
     * imo编号,船舶imo编号
     */
    private Integer imo;
    /**
     * 船舶呼号,船舶呼号
     */
    private String call_sign;
    /**
     * 船舶名称,船舶英文名称
     */
    private String ship_name;
    /**
     * 船舶中文名称
     */
    private String ship_cnname;
    /**
     * 数据来源,数据源，0代表岸基或船基AIS基站，1代表卫星基站
     */
    private Integer data_source;

    /**
     * 船舶类型,船舶类型编号，对应关系请查看附录
     */
    private Integer ship_type;
    /**
     * 船舶长度，米，取值范围(0-1022)
     */
    private Float length;
    /**
     * 船舶宽度，米
     */
    private Float width;
    /**
     * 左舷距，米
     */
    private Float left;
    /**
     * 尾距，米
     */
    private Float trail;
    /**
     * 吃水深度，米
     */
    private Float draught;
    /**
     * 目的地,标准化后的目的地港口名称
     */
    private String dest;
    /**
     * 目的地代码
     */
    private String destcode;
    /**
     * 预计到达时间："2025-03-03 10:51:40"，北京时间
     */
    private String eta;
    /**
     * 预计到达时间,Unix时间戳
     */
    private Integer eta_utc;
    /**
     * 航行状态,0,船舶航行状态，当返回值为-1时，代表为无效数据
     */
    private Integer navistat;

    /**
     * 坐标纬度，WGS84坐标系
     */

    private Double lat;
    /**
     * 坐标经度，WGS84坐标系
     */
    private Double lng;
    /**
     * 船舶实时速度，单位：节，当返回值为-1时，代表为无效数据
     */
    private Float sog;
    /**
     * 航迹向，单位：度，当返回值为-1时，代表为无效数据
     */
    private Float cog;
    /**
     * 航首向，单位：度，当返回值为511时，代表为无效数据
     */
    private Float hdg;
    /**
     * 转向率 ，单位度/分钟
     */
    private Float rot;
    /**
     * 最后更新时间,AIS最后更新上传的时间，“2025-03-26 14:00:00”，北京时间
     */
    private String last_time;

    /**
     * 最后更新时间,Unix时间戳
     */
    private Integer last_time_utc;

    /**
     * 船队
     */
    private String fleet_id;
}
