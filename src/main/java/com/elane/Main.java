package com.elane;

import cn.hutool.json.JSONObject;
import com.elane.api.Shipxy;
import com.elane.params.GetAreaShipParams;
import com.elane.params.SearchShipParams;

public class Main {
    private static String key = "484db43a65ec4f87b5b4dcc69e586bf7";

    public static void main(String[] args) {
//        SearchShipFn();
//        GetSingleShipFn();
//        GetManyShipFn();
//        GetFleetShipFn();
//        GetSurRoundingShipFn();
        GetAreaShipFn();
    }


    public static void SearchShipFn() {
        SearchShipParams params = new SearchShipParams();
        params.setKey(key);
        params.setKeywords("cosco");
        params.setMax(2);
        JSONObject result = Shipxy.SearchShip(params);
        System.out.println(result);
    }

    public static void GetSingleShipFn() {
        JSONObject result = Shipxy.GetSingleShip(key, 413961925);
        System.out.println(result);
    }

    public static void GetManyShipFn() {
        JSONObject result = Shipxy.GetManyShip(key, "413961925,477232800,477172700");
        System.out.println(result);
    }

    public static void GetFleetShipFn() {
        JSONObject result = Shipxy.GetFleetShip(key, "72efa1dc-dc1d-45a6-9090-880835105363");
        System.out.println(result);
    }

    public static void GetSurRoundingShipFn() {
        JSONObject result = Shipxy.GetSurRoundingShip(key, 413961925);
        System.out.println(result);
    }

    public static void GetAreaShipFn() {
        GetAreaShipParams params = new GetAreaShipParams();
        params.setKey(key);
        params.setRegion("121.289063,35.424868-122.783203,35.281501-122.167969,33.979809");
        JSONObject result = Shipxy.GetAreaShip(params);
        System.out.println(result);
    }
}