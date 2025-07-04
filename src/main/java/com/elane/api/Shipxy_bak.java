package com.elane.api;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.elane.params.GetAreaShipParams;
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
public class Shipxy_bak {
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

    /**
     * 1船舶查询-1.2船舶位置查询-单船位置查询
     * https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc
     * @param key 授权码：必填，船讯网授权码，验证服务权限
     * @param mmsi 船舶mmsi编号：必填，船舶mmsi编号，9 位数字
     * @return 查看在线文档
     */
    public static ResultOne<ShipResult> GetSingleShip(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        String resultStr = getMethod("GetSingleShip", paramMap);
        ResultOne<ShipResult> resultObj = JSONUtil.toBean(resultStr, ResultOne.class);
        return resultObj;
    }

    /**
     * 1船舶查询-1.2船舶位置查询-多船位置查询
     * https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc
     * @param key 授权码：必填，船讯网授权码，验证服务权限
     * @param mmsis 船舶mmsi编号：必填，船舶编号，船舶mmsi编号，多船查询以英文逗号隔开，单次查询船舶数量不超过100
     * @return
     */
    public static ResultList<ShipResult> GetManyShip(String key, String mmsis) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsis", mmsis);
        String resultStr = getMethod("GetManyShip", paramMap);
        ResultList<ShipResult> resultObj = JSONUtil.toBean(resultStr, ResultList.class);
        return resultObj;
    }

    /**
     * 1船舶查询-1.2船舶位置查询-船队船位置查询
     * https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc
     * @param key 授权码：必填，船讯网授权码，验证服务权限
     * @param fleet_id 船队编号：必填，控制台中维护的船队id，查询船队下所有船舶数据。
     * @return
     */
    public static ResultList<ShipResult> GetFleetShip(String key, String fleet_id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("fleet_id", fleet_id);
        String resultStr = getMethod("GetFleetShip", paramMap);
        ResultList<ShipResult> resultObj = JSONUtil.toBean(resultStr, ResultList.class);
        return resultObj;
    }

    /**
     * 1船舶查询-1.3周边船舶查询
     * https://hiiau7lsqq.feishu.cn/wiki/XXTiwDpetivSFhkciWic6qarnOc
     * @param key 授权码：必填，船讯网授权码，验证服务权限
     * @param mmsi 船舶mmsi编号：必填，船舶mmsi编号，9 位数字
     * @return
     */
    public static ResultList<ShipResult> GetSurRoundingShip(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        String resultStr = getMethod("GetSurRoundingShip", paramMap);
        ResultList<ShipResult> resultObj = JSONUtil.toBean(resultStr, ResultList.class);
        return resultObj;
    }

    public static ResultList<ShipResult> GetAreaShip(GetAreaShipParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        String resultStr = postMethod("GetAreaShip", paramMap);
        ResultList<ShipResult> resultObj = JSONUtil.toBean(resultStr, ResultList.class);
        return resultObj;
    }
}
