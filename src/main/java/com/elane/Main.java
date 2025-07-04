package com.elane;

import com.elane.api.Shipxy;
import com.elane.params.SearchShipParams;
import com.elane.result.ResultObj;
import com.elane.result.SearcheShipResult;

public class Main {
    private static String key = "484db43a65ec4f87b5b4dcc69e586bf7";
    public static void main(String[] args) {
        SearchShipFn();
    }

    public static void SearchShipFn(){
        SearchShipParams params = new SearchShipParams();
        params.setKey(key);
        params.setKeywords("cosco");
        params.setMax(2);
        ResultObj<SearcheShipResult> result = Shipxy.SearchShip(params);
        System.out.println(result);
    }
}