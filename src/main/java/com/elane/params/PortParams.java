package com.elane.params;

import lombok.Data;

@Data
public class PortParams extends BaseObj {
    /**
     * 港口标准code,港口标准五位码
     */
    private String port_code;
    /**
     * 船舶类型, 筛选船舶的类型，船舶类型清单请参考文档，不填写时返回全部船舶。
     */
    private Integer ship_type;
}
