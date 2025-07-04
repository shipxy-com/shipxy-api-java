package com.elane.result;

import lombok.Data;

import java.util.List;

@Data
public class ResultObj<T> {
    private Integer status;
    private String msg;
    private Integer total;
    private List<T> data;
}
