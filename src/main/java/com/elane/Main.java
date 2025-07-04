package com.elane;

import com.elane.api.Shipxy;
import com.elane.params.SearchShipParams;
import com.elane.result.ResultList;
import com.elane.result.ResultOne;
import com.elane.result.SearcheShipResult;
import com.elane.result.ShipResult;

public class Main {
    private static String key = "484db43a65ec4f87b5b4dcc69e586bf7";

    public static void main(String[] args) {
//        SearchShipFn();
        GetSingleShipFn();
    }


    public static void SearchShipFn() {
        SearchShipParams params = new SearchShipParams();
        params.setKey(key);
        params.setKeywords("cosco");
        params.setMax(2);
        ResultList<SearcheShipResult> result = Shipxy.SearchShip(params);
        System.out.println(result);
    }

    public static void GetSingleShipFn() {
        ResultOne<ShipResult> result = Shipxy.GetSingleShip(key, 413961925);
        System.out.println(result);
    }
}