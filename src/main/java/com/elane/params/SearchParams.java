package com.elane.params;

import lombok.Data;

@Data
public class SearchParams extends BaseObj {
    /**
     * 关键字，船舶查询的输入关键字，可以是船名、呼号、MMSI、IMO 等，匹配原则：MMSI 为 9 位数, IMO 为 7 位数
     */
    private String keywords;
    /**
     * 最大返回数量，最多返回的结果数量，该值最大 100
     */
    private Integer max;
}
