package com.elane.api;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.elane.params.SearchShipParams;
import com.elane.result.ResultList;
import com.elane.result.ResultOne;
import com.elane.result.SearcheShipResult;
import com.elane.result.ShipResult;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：White
 * https://hiiau7lsqq.feishu.cn/wiki/E0wAwrPpvieGhSk5wLCctNqonVb
 */
public class Shipxy {
    private static String apiUrl = "https://api.shipxy.com/apicall/v3";

    public static String getMethod(String methodName, Map<String, Object> paramMap) {
        return HttpUtil.get(apiUrl + "/" + methodName, paramMap);
    }

    public static String postMethod(String methodName, Map<String, Object> paramMap) {
        return HttpUtil.post(apiUrl + "/" + methodName, paramMap);
    }

    /**
     * 1船舶查询-1.6船舶档案查询
     * https://hiiau7lsqq.feishu.cn/wiki/Vvd2wHECliYz6okSoYucTRXvnsd
     *
     * @param params SearchShipParams
     * @return
     */
    public static ResultList<SearcheShipResult> SearchShip(SearchShipParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("SearchShip", paramMap);
        ResultList<SearcheShipResult> resultObj = JSONUtil.toBean(resultStr, ResultList.class);
        return resultObj;
    }

    public static ResultOne<ShipResult> GetSingleShip(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        String resultStr = getMethod("GetSingleShip", paramMap);
        ResultOne<ShipResult> resultObj = JSONUtil.toBean(resultStr, ResultOne.class);
        return resultObj;
    }

    public static ResultList<ShipResult> GetManyShip(String key, String mmsis) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsis", mmsis);
        String resultStr = getMethod("GetManyShip", paramMap);
        ResultList<ShipResult> resultObj = JSONUtil.toBean(resultStr, ResultList.class);
        return resultObj;
    }
}
