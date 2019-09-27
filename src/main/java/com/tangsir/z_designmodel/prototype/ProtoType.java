package com.tangsir.z_designmodel.prototype;

import java.util.ArrayList;
import java.util.List;

public class ProtoType {
    public static List<OrderApi> dealOrder(OrderApi orderInstance){
        List<OrderApi> list = new ArrayList<>();
        list.add(orderInstance);
       while( orderInstance.getOrderNum()>1000){
            OrderApi newApi = (OrderApi)orderInstance.clone();
            newApi.setOrderNum(1000);
            list.add(newApi);
            orderInstance.setOrderNum(orderInstance.getOrderNum()-1000);
        }
       return list;
    }
}
