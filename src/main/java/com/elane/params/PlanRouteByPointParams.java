package com.elane.params;

import lombok.Data;

@Data
public class PlanRouteByPointParams extends BaseObj {
    /**
     * 起始点，出发的位置点，lng,lat
     */
    private String start_point;
    /**
     * 结束点，到达的位置点，lng,lat
     */
    private String end_point;
    /**
     * 绕航节点,需要避让的节点，id详见附录7 。绕航多节点时，不同id之间使用逗号分隔；不填则不绕航；一次请求绕航的节点控制在10个以内
     */
    private String avoid;
    /**
     * 途经点,必经的点，lng,lat - lng,lat；多点之间用“-”连接；不填则不必经；一次请求途经的节点控制在30个以内
     */
    private String through;
}
