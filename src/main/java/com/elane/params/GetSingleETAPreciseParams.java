package com.elane.params;

import lombok.Data;

@Data
public class GetSingleETAPreciseParams extends BaseObj {
    /**
     * 船舶mmsi编号，9 位数字
     */
    private Integer mmsi;
    /**
     * 港口标准CODE值，可以使用港口查询API获取。如果此处不填写港口，则默认查询船舶在AIS中填写的下一目的港口。
     */
    private String port_code;
    /**
     * 船舶在接下来的航行中维持的速度，单位：节。如果此处不填写，则默认按照船舶近一个月的平均航速来计算预计到达，平均航速是去掉在港口地区锚泊的船速信息后计算的平均值。
     */
    private Float speed;
}
