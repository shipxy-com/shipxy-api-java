package com.elane.params;

import lombok.Data;

@Data
public class GetShipStatusParams extends BaseObj {
    /**
     * 船舶编号,船舶mmsi编号
     */
    private Integer mmsi;
    /**
     * imo编号,船舶imo编号
     */
    private Integer imo;
    /**
     * 船舶名称,船舶英文名称
     */
    private String ship_name;
    /**
     * 船舶呼号
     * 匹配原则：空格可有可无，字母可大写可小写，但字母数字顺序和个数必须与查询的呼号一致
     * 提示：如果不同船舶的呼号相同，则相同呼号船舶的靠港记录都将返回
     */
    private String call_sign;

    /**
     * 时间类型(选填)。 1当地时区，如果不存在，使用零时区；2北京时区；3零时区，即格林尼治平均时。默认值：2
     */
    private Integer time_zone;
}
