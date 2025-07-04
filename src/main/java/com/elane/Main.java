package com.elane;

import cn.hutool.json.JSONObject;
import com.elane.api.Shipxy;
import com.elane.params.*;

public class Main {
    private static String key = "484db43a65ec4f87b5b4dcc69e586bf7";

    public static void main(String[] args) {
//        SearchShipFn();
//        GetSingleShipFn();
//        GetManyShipFn();
//        GetFleetShipFn();
//        GetSurRoundingShipFn();
//        GetAreaShipFn();
//        GetShipRegistryFn();
//        SearchShipParticularFn();

//        SearchPortFn();
//        GetBerthShipsFn();
//        GetAnchorShipsFn();

//        GetETAShipsFn();
//        GetShipTrackFn();
//        SearchshipApproachFn();

//        GetPortofCallByShipFn();
//        GetPortofCallByShipPortFn();
//        GetShipStatusFn();
//        GetPortofCallByPortFn();

//        PlanRouteByPointFn();
        PlanRouteByPortFn();
    }


    public static void SearchShipFn() {
        SearchParams params = new SearchParams();
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

    public static void GetShipRegistryFn() {
        JSONObject result = Shipxy.GetShipRegistry(key, 413961925);
        System.out.println(result);
    }

    public static void SearchShipParticularFn() {
        JSONObject result = Shipxy.SearchShipParticular(key, 477172700);
        System.out.println(result);
    }

    public static void SearchPortFn() {
        SearchParams params = new SearchParams();
        params.setKey(key);
        params.setKeywords("CNS");
        JSONObject result = Shipxy.SearchPort(params);
        System.out.println(result);
    }

    public static void GetBerthShipsFn() {
        PortParams params = new PortParams();
        params.setKey(key);
        params.setPort_code("CNSHG");
//        params.setShip_type(52);
        JSONObject result = Shipxy.GetBerthShips(params);
        System.out.println(result);
    }

    public static void GetAnchorShipsFn() {
        PortParams params = new PortParams();
        params.setKey(key);
        params.setPort_code("CNSHG");
//        params.setShip_type(52);
        JSONObject result = Shipxy.GetAnchorShips(params);
        System.out.println(result);
    }

    public static void GetETAShipsFn() {
        GetETAShipsParams params = new GetETAShipsParams();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        JSONObject result = Shipxy.GetETAShips(params);
        System.out.println(result);
    }

    public static void GetShipTrackFn() {
        GetShipTrackParams params = new GetShipTrackParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        JSONObject result = Shipxy.GetShipTrack(params);
        System.out.println(result);
    }

    public static void SearchshipApproachFn() {
        SearchshipApproachParams params = new SearchshipApproachParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1746612218);
        params.setEnd_time(1747044218);
        JSONObject result = Shipxy.SearchshipApproach(params);
        System.out.println(result);
    }

    public static void GetPortofCallByShipFn() {
        GetPortofCallByShipParams params = new GetPortofCallByShipParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setStart_time(1751007589);
        params.setEnd_time(1751440378);
        JSONObject result = Shipxy.GetPortofCallByShip(params);
        System.out.println(result);
    }

    public static void GetPortofCallByShipPortFn() {
        GetPortofCallByShipPortParams params = new GetPortofCallByShipPortParams();
        params.setKey(key);
        params.setMmsi(477172700);
        params.setPort_code("CNSHG");
        params.setStart_time(1751007589);
        params.setEnd_time(1751440378);
        JSONObject result = Shipxy.GetPortofCallByShipPort(params);
        System.out.println(result);
    }

    public static void GetShipStatusFn() {
        GetShipStatusParams params = new GetShipStatusParams();
        params.setKey(key);
        params.setMmsi(477172700);
        JSONObject result = Shipxy.GetShipStatus(params);
        System.out.println(result);
    }

    public static void GetPortofCallByPortFn() {
        GetPortofCallByPortParams params = new GetPortofCallByPortParams();
        params.setKey(key);
        params.setPort_code("CNSHG");
        params.setStart_time(1751007589);
        params.setEnd_time(1751440378);
        JSONObject result = Shipxy.GetPortofCallByPort(params);
        System.out.println(result);
    }

    public static void PlanRouteByPointFn() {
        PlanRouteByPointParams params = new PlanRouteByPointParams();
        params.setKey(key);
        params.setStart_point("113.571144,22.844316");
        params.setEnd_point("121.58414,31.37979");
        JSONObject result = Shipxy.PlanRouteByPoint(params);
        System.out.println(result);
    }

    public static void PlanRouteByPortFn() {
        PlanRouteByPortParams params = new PlanRouteByPortParams();
        params.setKey(key);
        params.setStart_port_code("CNGZG");
        params.setEnd_port_code("CNSHG");
        JSONObject result = Shipxy.PlanRouteByPort(params);
        System.out.println(result);
    }
}