package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultList<T> {
    /**
     * 状态
     */
    private Integer status;
    /**
     * 结果
     */
    private String msg;
    /**
     * 总数
     */
    private Integer total;
    /**
     * 数据
     */
    private List<T> data;
}
