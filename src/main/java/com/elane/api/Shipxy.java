package com.elane.api;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.elane.params.*;

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

    public static JSONObject getMethodJson(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpUtil.get(apiUrl + "/" + methodName, paramMap);
        return JSONUtil.parseObj(resultStr);
    }

    public static JSONObject postMethodJson(String methodName, Map<String, Object> paramMap) {
        String resultStr = HttpUtil.post(apiUrl + "/" + methodName, paramMap);
        return JSONUtil.parseObj(resultStr);
    }

    /**
     * 1船舶查询-1.6船舶档案查询
     * https://hiiau7lsqq.feishu.cn/wiki/Vvd2wHECliYz6okSoYucTRXvnsd
     *
     * @param params SearchShipParams
     * @return
     */
    public static JSONObject SearchShip(SearchParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return postMethodJson("SearchShip", paramMap);
    }

    /**
     * 1船舶查询-1.2船舶位置查询-单船位置查询
     * https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc
     *
     * @param key  授权码：必填，船讯网授权码，验证服务权限
     * @param mmsi 船舶mmsi编号：必填，船舶mmsi编号，9 位数字
     * @return 查看在线文档
     */
    public static JSONObject GetSingleShip(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        return getMethodJson("GetSingleShip", paramMap);
    }

    /**
     * 1船舶查询-1.2船舶位置查询-多船位置查询
     * https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc
     *
     * @param key   授权码：必填，船讯网授权码，验证服务权限
     * @param mmsis 船舶mmsi编号：必填，船舶编号，船舶mmsi编号，多船查询以英文逗号隔开，单次查询船舶数量不超过100
     * @return
     */
    public static JSONObject GetManyShip(String key, String mmsis) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsis", mmsis);
        return getMethodJson("GetManyShip", paramMap);
    }

    /**
     * 1船舶查询-1.2船舶位置查询-船队船位置查询
     * https://hiiau7lsqq.feishu.cn/wiki/GxF2w6cZHisQiEkBRatcoIqlnfc
     *
     * @param key      授权码：必填，船讯网授权码，验证服务权限
     * @param fleet_id 船队编号：必填，控制台中维护的船队id，查询船队下所有船舶数据。
     * @return
     */
    public static JSONObject GetFleetShip(String key, String fleet_id) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("fleet_id", fleet_id);
        return getMethodJson("GetFleetShip", paramMap);
    }

    /**
     * 1船舶查询-1.3周边船舶查询
     * https://hiiau7lsqq.feishu.cn/wiki/XXTiwDpetivSFhkciWic6qarnOc
     *
     * @param key  授权码：必填，船讯网授权码，验证服务权限
     * @param mmsi 船舶mmsi编号：必填，船舶mmsi编号，9 位数字
     * @return
     */
    public static JSONObject GetSurRoundingShip(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        return getMethodJson("GetSurRoundingShip", paramMap);
    }

    /**
     * 1船舶查询-1.4区域船舶查询
     * https://hiiau7lsqq.feishu.cn/wiki/ZlcrwKpgqik1L3kvbIMcBJUCn1U
     * @param params
     * @return
     */
    public static JSONObject GetAreaShip(GetAreaShipParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return postMethodJson("GetAreaShip", paramMap);
    }

    /**
     * 1船舶查询-1.5船舶船籍查询
     * https://hiiau7lsqq.feishu.cn/wiki/Ko5gw1o0ZiMQankWEAscSMoin7g
     * @param key 授权码：必填，船讯网授权码，验证服务权限
     * @param mmsi 船舶mmsi编号：必填，船舶mmsi编号
     * @return
     */
    public static JSONObject GetShipRegistry(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        return getMethodJson("GetShipRegistry", paramMap);
    }

    /**
     * 1船舶查询-1.6船舶档案查询
     * https://hiiau7lsqq.feishu.cn/wiki/Vvd2wHECliYz6okSoYucTRXvnsd
     * @param key
     * @param mmsi
     * @return
     */
    public static JSONObject SearchShipParticular(String key, Integer mmsi) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("key", key);
        paramMap.put("mmsi", mmsi);
        return getMethodJson("SearchShipParticular", paramMap);
    }

    /**
     * 2港口查询-2.1港口信息查询
     * https://hiiau7lsqq.feishu.cn/wiki/DAlUwEn9Zi50gckSv0uc1qsIn6f
     * @param params
     * @return
     */
    public static JSONObject SearchPort(SearchParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return getMethodJson("SearchPort", paramMap);
    }

    /**
     * 2港口查询-2.2港口当前靠泊船查询
     * https://hiiau7lsqq.feishu.cn/wiki/KdBNwIxOhijpALkCkNXc69MKn3g
     * @param params
     * @return
     */
    public static JSONObject GetBerthShips(PortParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return getMethodJson("GetBerthShips", paramMap);
    }

    /**
     * 2港口查询-2.3港口当前到锚船舶查询
     * https://hiiau7lsqq.feishu.cn/wiki/WTHnwa66niA4VhkmNVXchRRSnYe
     * @param params
     * @return
     */
    public static JSONObject GetAnchorShips(PortParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return getMethodJson("GetAnchorShips", paramMap);
    }

    /**
     * 2港口查询-2.4港口预抵船舶查询
     * https://hiiau7lsqq.feishu.cn/wiki/Poe3wdXkwiwzMUkATcJcigeBnJh
     * @param params
     * @return
     */
    public static JSONObject GetETAShips(GetETAShipsParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return getMethodJson("GetETAShips", paramMap);
    }

    /**
     * 3历史行为-3.1船舶历史轨迹查询
     * https://hiiau7lsqq.feishu.cn/wiki/RK2Uwh7tziQ7SnkzlDgcUk8Nnkc
     * @param params
     * @return
     */
    public static JSONObject GetShipTrack(GetShipTrackParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return getMethodJson("GetShipTrack", paramMap);
    }

    /**
     * 3历史行为-3.2船舶搭靠记录查询
     * https://hiiau7lsqq.feishu.cn/wiki/GYrTwxfzRiQdDxkJYOWcF3kKnnf
     * @param params
     * @return
     */
    public static JSONObject SearchshipApproach(SearchshipApproachParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return getMethodJson("SearchshipApproach", paramMap);
    }

    /**
     * 4挂靠记录-4.1船舶历史挂靠记录
     * https://hiiau7lsqq.feishu.cn/wiki/Sv5rw61KVioV0ekq4ytcBpGgnGd
     * @param params
     * @return
     */
    public static JSONObject GetPortofCallByShip(GetPortofCallByShipParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return getMethodJson("GetPortofCallByShip", paramMap);
    }

    /**
     * 4挂靠记录-4.2船舶挂靠指定港口记录
     * https://hiiau7lsqq.feishu.cn/wiki/R01xw8GxYiPd08kGhDeckVojnSC
     * @param params
     * @return
     */
    public static JSONObject GetPortofCallByShipPort(GetPortofCallByShipPortParams params) {
        Map<String, Object> paramMap = BeanUtil.beanToMap(params);
        return getMethodJson("GetPortofCallByShipPort", paramMap);
    }
}
