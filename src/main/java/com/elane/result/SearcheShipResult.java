package com.elane.result;

import lombok.Data;

@Data
public class SearcheShipResult
{
    private Integer match_type;
    private Integer mmsi;
    private Integer imo;
    private String call_sign;
    private String ship_name;
    private Integer data_source;
    private String last_time;
}
