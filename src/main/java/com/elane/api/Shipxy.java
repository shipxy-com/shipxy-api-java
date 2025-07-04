package com.elane.api;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.elane.params.SearchShipParams;
import com.elane.result.ResultObj;
import com.elane.result.SearcheShipResult;

import java.util.Map;

/**
 * 作者：White
 * https://hiiau7lsqq.feishu.cn/wiki/E0wAwrPpvieGhSk5wLCctNqonVb
 */
public class Shipxy {
    private static String apiUrl = "https://api.shipxy.com/apicall/v3";

    public static String getMethod(String methodName, Map<String, Object> paramMap){
        return HttpUtil.get(apiUrl+"/"+methodName, paramMap);
    }
    public static String postMethod(String methodName, Map<String, Object> paramMap){
        return HttpUtil.post(apiUrl+"/"+methodName, paramMap);
    }

    /**
     * 1船舶查询-1.6船舶档案查询
     * https://hiiau7lsqq.feishu.cn/wiki/Vvd2wHECliYz6okSoYucTRXvnsd
     * @param params SearchShipParams
     * @return
     */
    public static ResultObj<SearcheShipResult> SearchShip(SearchShipParams params){
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr =  postMethod("SearchShip", paramMap);
        ResultObj<SearcheShipResult> resultObj = JSONUtil.toBean(resultStr, ResultObj.class);
        return resultObj;
    }
}
