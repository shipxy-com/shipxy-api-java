package com.elane.params;

import lombok.Data;

@Data
public class GetAreaShipParams extends BaseObj {
    /**
     * 查询区域,经纬度逗号分隔，多个点减号分隔，如：（lng,lat - lng,lat ）经纬度数，多个经纬度坐标点必须按照顺时针或逆时针依次输入。
     */
    private String region;
    /**
     * 输出格式,输出数据格式类型选择：0为二进制 Base64 编码，1为json格式，默认为1
     */
    private Integer output;
    /**
     * 会话令牌,当区域范围船舶单次请求无法全部返回时，可以根据首次请求返回的scode再次请求剩余的数据，保证全部返回。
     */
    private Integer scode;
}
